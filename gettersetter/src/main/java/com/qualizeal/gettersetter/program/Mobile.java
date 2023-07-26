package com.qualizeal.gettersetter.program;
public class Mobile {
	private String brandname;
	private int ram;
	private int rom;
	private int cam;
	private String display;
	private String processor;
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getRom() {
		return rom;
	}
	public void setRom(int rom) {
		this.rom = rom;
	}
	public int getCamara() {
		return cam;
	}
	public void setCamara(int cam) {
		this.cam = cam;
	}
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
}
