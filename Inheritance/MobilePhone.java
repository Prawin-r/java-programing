package Inheritance;

public class MobilePhone {
	int ram;
	int rom;
	MobilePhone(int ram,int rom){
		this.ram=ram;
		this.rom=rom;
	}
	@Override
	public String toString() {
		return ("RAM-"+this.ram+ " " +"ROM-"+this.rom);

}
}
