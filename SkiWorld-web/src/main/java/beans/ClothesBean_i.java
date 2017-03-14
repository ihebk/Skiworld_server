package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import contracts.ClotheCrudEJBLocal;
import entities.Clothes;

@ManagedBean
@ApplicationScoped
public class ClothesBean_i implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PostConstruct
	public void init() {
		liste = clotheCrudEJBLocal.findAllClothes();

	}

	@EJB
	private ClotheCrudEJBLocal clotheCrudEJBLocal;
	private Clothes selectedclothes;
	private Boolean test = false;
	private List<Clothes> liste = new ArrayList<Clothes>();
	private Set<Clothes> cartclothes = new HashSet<Clothes>();
	private int qt=0;
	

	

	public int getQt() {
		return qt;
	}

	public void setQt(int qt) {
		this.qt = qt;
	}

	public Set<Clothes> getCartclothes() {
		return cartclothes;
	}

	public void setCartclothes(Set<Clothes> cartclothes) {
		this.cartclothes = cartclothes;
	}

	public Clothes getSelectedclothes() {
		return selectedclothes;
	}

	public void addMessage(String summary) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

	public void setSelectedclothes(Clothes selectedclothes) {
		this.selectedclothes = selectedclothes;
		addMessage("Adding complete");
	}

	public Boolean getTest() {
		return test;
	}

	public void setTest(Boolean test) {
		this.test = test;
	}

	public List<Clothes> getListe() {
		return liste;
	}

	public void setListe(List<Clothes> liste) {
		this.liste = liste;
	}

	public String goToDetails() {
		String navTo = "";
		if (selectedclothes != null) {

			navTo = "details?faces-redirect=true";
		}

		return navTo;
	}

	public String addToCart(Clothes c) {
		cartclothes.add(c);
		
		String navTo = "/pages/cart/cart?faces-redirect=true";

		return navTo;
	}

	public List<Clothes> convertToList(Set<Clothes> set) {
		if (set.size() ==0){
			return null;
		}
		return new ArrayList<Clothes>(set);
	}

	public float getClothesPrice(List<Clothes> c) {
		float sum = 0;
		float tot=0;
		for (Clothes e : c) {
			tot = e.getPrice()*e.getQuantity();
			sum = sum + tot;
		}
		return sum;

	}
	
	public float getClothePriceQt(Clothes c) {
		
		float tot=0;
		
			tot = c.getPrice()*c.getQuantity();

		return tot;

	}

	public String removeClothe(Clothes e) {
		String navTo = "/pages/cart/cart?faces-redirect=true";

			cartclothes.remove(e);

			return navTo;
		

	}
	
	public String emptycart(){
		String navTo = "/pages/cart/cart?faces-redirect=true";
		cartclothes.clear();
		
		return navTo;
		
	}

}
