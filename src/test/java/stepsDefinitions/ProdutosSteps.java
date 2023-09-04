package stepsDefinitions;

import static utils.Utils.Na;
import static utils.Utils.driver;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pageObjects.LoginPage;
import pageObjects.ProdutosPage;

public class ProdutosSteps {

	@Dado("que o usuario esteja logado")
	public void queOUsuarioEstejaLogadoComLoginESenha() {
		Na(LoginPage.class).Login();
	}

	@Dado("deseja ver detalhes do item mochila")
	public void desejaVerDetalhesDoItemMochila() {
		Na(ProdutosPage.class).mochila();
	}

	@Dado("adiciona ao carrinho")
	public void adicionaAoCarrinho() {
		Na(ProdutosPage.class).addMochila();
	}

	@Dado("e aciona o botao carrinho")
	public void eAcionaOBotaoCarrinho() {
		Na(ProdutosPage.class).entrarCarrinho();
	}

	@Entao("mostra que a mochila foi adicionada")
	public void mostraQueAMochilaFoiAdicionada() {
		String texto = driver
				.findElement(By.xpath("//div[@class='inventory_item_name'][contains(.,'Sauce Labs Backpack')]"))
				.getText();
		Assert.assertEquals("Sauce Labs Backpack", texto);
	}

	@Dado("deseje adicionar todos os itens ao carrinho")
	public void desejeAdicionarTodosOsItensAoCarrinho() {
		Na(ProdutosPage.class).todosItens();
	}

	@Entao("carrinho mostra possuir todos os itens")
	public void carrinhoMostraPossuirTodosOsItens() {
		String texto = driver.findElement(By.xpath("//span[@class='shopping_cart_badge'][contains(.,'6')]")).getText();
		Assert.assertEquals("6", texto);
	}

	@Dado("o usuario desejou remover os itens")
	public void oUsuarioDesejouRemoverOsItens() {
		Na(ProdutosPage.class).removerTodos();
	}

	@Entao("mostra o carrinho vazio")
	public void mostraOCarrinhoVazio() {
		driver.findElement(By.xpath("//div[@class='removed_cart_item']"));
		Assert.assertTrue(true);

	}

	@Dado("adiciona um item ao carrinho")
	public void adicionaUmItemAoCarrinho() {
		Na(ProdutosPage.class).bikeLight();
	}

	@Dado("deseja contunuar comprando")
	public void desejaContunuarComprando() {
		Na(ProdutosPage.class).voltarCompras();
	}

	@Entao("volta a pagina inicial")
	public void voltaAPaginaInicial() {
		String texto = driver.findElement(By.xpath("//span[contains(@class,'title')]")).getText();
		Assert.assertEquals("Products", texto);
	}

	@Dado("deseje selecionar itens do mais barato para o mais caro")
	public void desejeSelecionarItensDoMaisBaratoParaOMaisCaro() {
		Na(ProdutosPage.class).selecionarBtn();
	}

	@Entao("mostra que esta do mais barato para o mais caro")
	public void mostraQueEstaDoMaisBaratoParaOMaisCaro() {
		String texto = driver.findElement(By.xpath("//span[contains(@class,'active_option')]")).getText();
		Assert.assertEquals("Price (low to high)", texto);

	}

}
