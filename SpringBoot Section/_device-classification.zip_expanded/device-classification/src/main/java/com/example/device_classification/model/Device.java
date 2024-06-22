package com.example.device_classification.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
public class Device {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "battery_power")
    private Integer batteryPower;
    
    @Column(name = "blue")
    private Boolean blue;
    
    @Column(name = "clock_speed")
    private double clockSpeed;
    
    @Column(name = "dual_sim")
    private Boolean dualSim;
    
    @Column(name = "fc")
    private Integer fc;
    
    @Column(name = "four_g")
    private Boolean fourG;
    
    @Column(name = "int_memory")
    private Integer intMemory;
    
    @Column(name = "m_dep")
    private double mDep;
    
    @Column(name = "mobile_wt")
    private Integer mobileWt;
    
    @Column(name = "n_cores")
    private Integer nCores;
    
    @Column(name = "pc")
    private Integer pc;
    
    @Column(name = "px_height")
    private Integer pxHeight;
    
    @Column(name = "px_width")
    private Integer pxWidth;
    
    @Column(name = "ram")
    private Integer ram;
    
    @Column(name = "sc_h")
    private Integer scH;
    
    @Column(name = "sc_w")
    private Integer scW;
    
    @Column(name = "talk_time")
    private Integer talkTime;
    
    @Column(name = "three_g")
    private Boolean threeG;
    
    @Column(name = "touch_screen")
    private Boolean touchScreen;
    
    @Column(name = "wifi")
    private Boolean wifi;
    
    @Column(name = "price_range")
    private Integer priceRange;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getBatteryPower() {
		return batteryPower;
	}

	public void setBatteryPower(Integer batteryPower) {
		this.batteryPower = batteryPower;
	}

	public Boolean isBlue() {
		return blue;
	}

	public void setBlue(Boolean blue) {
		this.blue = blue;
	}

	public double getClockSpeed() {
		return clockSpeed;
	}

	public void setClockSpeed(double clockSpeed) {
		this.clockSpeed = clockSpeed;
	}

	public Boolean isDualSim() {
		return dualSim;
	}

	public void setDualSim(Boolean dualSim) {
		this.dualSim = dualSim;
	}

	public Integer getFc() {
		return fc;
	}

	public void setFc(Integer fc) {
		this.fc = fc;
	}

	public Boolean isFourG() {
		return fourG;
	}

	public void setFourG(Boolean fourG) {
		this.fourG = fourG;
	}

	public Integer getintMemory() {
		return intMemory;
	}

	public void setintMemory(Integer intMemory) {
		this.intMemory = intMemory;
	}

	public double getmDep() {
		return mDep;
	}

	public void setmDep(double mDep) {
		this.mDep = mDep;
	}

	public Integer getMobileWt() {
		return mobileWt;
	}

	public void setMobileWt(Integer mobileWt) {
		this.mobileWt = mobileWt;
	}

	public Integer getnCores() {
		return nCores;
	}

	public void setnCores(Integer nCores) {
		this.nCores = nCores;
	}

	public Integer getPc() {
		return pc;
	}

	public void setPc(Integer pc) {
		this.pc = pc;
	}

	public Integer getPxHeight() {
		return pxHeight;
	}

	public void setPxHeight(Integer pxHeight) {
		this.pxHeight = pxHeight;
	}

	public Integer getPxWidth() {
		return pxWidth;
	}

	public void setPxWidth(Integer pxWidth) {
		this.pxWidth = pxWidth;
	}

	public Integer getRam() {
		return ram;
	}

	public void setRam(Integer ram) {
		this.ram = ram;
	}

	public Integer getScH() {
		return scH;
	}

	public void setScH(Integer scH) {
		this.scH = scH;
	}

	public Integer getScW() {
		return scW;
	}

	public void setScW(Integer scW) {
		this.scW = scW;
	}

	public Integer getTalkTime() {
		return talkTime;
	}

	public void setTalkTime(Integer talkTime) {
		this.talkTime = talkTime;
	}

	public Boolean isThreeG() {
		return threeG;
	}

	public void setThreeG(Boolean threeG) {
		this.threeG = threeG;
	}

	public Boolean isTouchScreen() {
		return touchScreen;
	}

	public void setTouchScreen(Boolean touchScreen) {
		this.touchScreen = touchScreen;
	}

	public Boolean isWifi() {
		return wifi;
	}

	public void setWifi(Boolean wifi) {
		this.wifi = wifi;
	}

	public Integer getPriceRange() {
		return priceRange;
	}

	public void setPriceRange(Integer priceRange) {
		this.priceRange = priceRange;
	}

  
}
