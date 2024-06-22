package com.example.device_classification.service;

import com.example.device_classification.model.Device;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;

import org.json.JSONObject;

@Service
public class DeviceService {

    @Value("${python.service.url}")
    private String pythonServiceUrl;

    private final RestTemplate restTemplate;

    public DeviceService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public int predictPrice(Device device) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.set("Content-Type", "application/json");

            JSONObject deviceJson = new JSONObject();
            deviceJson.put("battery_power", device.getBatteryPower());
            deviceJson.put("blue", device.isBlue() ? 1 : 0);
            deviceJson.put("clock_speed", device.getClockSpeed());
            deviceJson.put("dual_sim", device.isDualSim() ? 1 : 0);
            deviceJson.put("fc", device.getFc());
            deviceJson.put("four_g", device.isFourG() ? 1 : 0);
            deviceJson.put("int_memory", device.getintMemory());
            deviceJson.put("m_dep", device.getmDep());
            deviceJson.put("mobile_wt", device.getMobileWt());
            deviceJson.put("n_cores", device.getnCores());
            deviceJson.put("pc", device.getPc());
            deviceJson.put("px_height", device.getPxHeight());
            deviceJson.put("px_width", device.getPxWidth());
            deviceJson.put("ram", device.getRam());
            deviceJson.put("sc_h", device.getScH());
            deviceJson.put("sc_w", device.getScW());
            deviceJson.put("talk_time", device.getTalkTime());
            deviceJson.put("three_g", device.isThreeG() ? 1 : 0);
            deviceJson.put("touch_screen", device.isTouchScreen() ? 1 : 0);
            deviceJson.put("wifi", device.isWifi() ? 1 : 0);

            HttpEntity<String> request = new HttpEntity<>(deviceJson.toString(), headers);

            ResponseEntity<String> response = restTemplate.exchange(
                    pythonServiceUrl + "/predict",
                    HttpMethod.POST,
                    request,
                    String.class
            );

            JSONObject responseBody = new JSONObject(response.getBody());
            return responseBody.getInt("prediction");

        } catch (HttpClientErrorException | HttpServerErrorException e) {
            throw new RuntimeException("Failed to get prediction from Python service: " + e.getResponseBodyAsString(), e);
        } catch (Exception e) {
            throw new RuntimeException("Failed to get prediction from Python service", e);
        }
    }
}
