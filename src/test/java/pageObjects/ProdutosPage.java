package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProdutosPage {

	// ================BOTOES==================

	@FindBy(xpath = "//div[@class='inventory_item_name'][contains(.,'Sauce Labs Backpack')]")
	private WebElement mochilaBtn;

	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	private WebElement adicionarMochila;

	@FindBy(xpath = "//a[contains(@class,'shopping_cart_link')]")
	private WebElement enterCart;
	
	@FindBy(id = "continue-shopping")
	private WebElement continueShopping;
	
	@FindBy(xpath = "//select[@class='product_sort_container']")
	private WebElement caixaSelecionar;
	

	// adicinar

	@FindBy(id = "add-to-cart-sauce-labs-bike-light")
	private WebElement bike;

	@FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
	private WebElement tshirt;

	@FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
	private WebElement jacket;

	@FindBy(id = "add-to-cart-sauce-labs-onesie")
	private WebElement onesie;

	@FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
	private WebElement tshirtRed;

	// remover

	@FindBy(id = "remove-sauce-labs-backpack")
	private WebElement removerMochila;

	@FindBy(id = "remove-sauce-labs-bike-light")
	private WebElement removerBike;

	@FindBy(id = "remove-sauce-labs-bolt-t-shirt")
	private WebElement removerTshirt;

	@FindBy(id = "remove-sauce-labs-fleece-jacket")
	private WebElement removerJacket;

	@FindBy(id = "remove-test.allthethings()-t-shirt-(red)")
	private WebElement removerTshirtRed;

	@FindBy(id = "remove-sauce-labs-onesie")
	private WebElement removerOnesie;

//================CAMPOS IMPUT==================

// ==================metodos=============

	public void mochila() {
		mochilaBtn.click();
	}

	public void addMochila() {
		adicionarMochila.click();
	}

	public void entrarCarrinho() {
		enterCart.click();
	}

	public void bikeLight() {
		bike.click();
	}

	public void camisa() {
		tshirt.click();
	}

	public void jaqueta() {
		jacket.click();
	}

	public void macacao() {
		onesie.click();
	}

	public void testaTudoRed() {
		tshirtRed.click();
	}

	public void todosItens() {
		addMochila();
		bikeLight();
		camisa();
		jaqueta();
		macacao();
		testaTudoRed();
	}

	public void removerMochila() {
		removerMochila.click();
	}

	public void removerBikeLight() {
		removerBike.click();
	}

	public void removerCamisa() {
		removerTshirt.click();
	}

	public void removerJaqueta() {
		removerJacket.click();
	}

	public void removerTestaTudoRed() {
		removerTshirtRed.click();
	}

	public void removerMacacao() {
		removerOnesie.click();
	}

	public void removerTodos() {
		removerMochila();
		removerBikeLight();
		removerCamisa();
		removerJaqueta();
		removerTestaTudoRed();
		removerMacacao();
	}
	
	public void voltarCompras() {
		continueShopping.click();
	}
	
	public void selecionarBtn() {
		new Select(caixaSelecionar).selectByValue("lohi");
	}
	
//	public boolean existeElementoPorTexto(String texto) {
//		List<WebElement> elementos = getDriver().findElements(By.xpath("//*[@text='"+texto+"']"));
//		return elementos.size() > 0;
//	}

}
