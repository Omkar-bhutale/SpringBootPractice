package in.omkar.comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Component
public class BillGenrater {
	 @Value("#{itemsInfo.idlyPriceFloat + itemsInfo.dosaPricae + itemsInfo.vadaPrice}")
	private float billAmount;
	@Value(value="Omkar")
	private String hotelName;
	@Autowired
	private ItemsInfo info;
	public float getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(float billAmount) {
		this.billAmount = billAmount;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	@Override
	public String toString() {
		return "BillGenrater [billAmount=" + billAmount + ", hotelName=" + hotelName + ", info=" + info + "]";
	}
	public ItemsInfo getInfo() {
		return info;
	}
	public void setInfo(ItemsInfo info) {
		this.info = info;
	}
	
	

}
