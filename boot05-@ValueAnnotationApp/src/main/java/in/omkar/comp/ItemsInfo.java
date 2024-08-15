package in.omkar.comp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Component
public class ItemsInfo {
	@Value(value = "${items.idli.price}")
	public float idlyPriceFloat;
	@Value(value = "${items.dosa.price}")
	public float dosaPricae;
	@Value(value = "${items.vada.price}")
	public float vadaPrice;
	public Float getIdlyPriceFloat() {
		return idlyPriceFloat;
	}
	public void setIdlyPriceFloat(Float idlyPriceFloat) {
		this.idlyPriceFloat = idlyPriceFloat;
	}
	public Float getDosaPricae() {
		return dosaPricae;
	}
	public void setDosaPricae(Float dosaPricae) {
		this.dosaPricae = dosaPricae;
	}
	public Float getVadaPrice() {
		return vadaPrice;
	}
	public void setVadaPrice(Float vadaPrice) {
		this.vadaPrice = vadaPrice;
	}
	@Override
	public String toString() {
		return "ItemsInfo [idlyPriceFloat=" + idlyPriceFloat + ", dosaPricae=" + dosaPricae + ", vadaPrice=" + vadaPrice
				+ "]";
	}
}
