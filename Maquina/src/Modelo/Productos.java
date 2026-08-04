package Modelo;

import java.util.ArrayList;

public class Productos {
	//codigo, nombre, leyenda, precio, cantidad
	String id, nombreProducto, leyenda;
	Integer precio, cantidad;
	String[][] products = {
	    {"A0", "Sanguche de miga Jamon y Queeso", "Un clasico", "1500", "6"},
	    {"A1", "Sanguche de miga Pollo y Palta", "Único e inigualable", "1600", "5"},
	    {"A2", "Sanguche de miga Vegetariano", "La opción mas prudente", "1400", "5"},
	    {"A3", "Sanguche de Milanesa", "Queerés dos", "1800", "4"},
	    {"A4", "Sanguche de Atún", "No comprar", "1700", "4"},
	    {"B0", "Agua Mineral", "Directa de los andes", "500", "20"},
	    {"B1", "Jugo de Naranja", "El mas organico", "700", "15"},
	    {"B2", "Gaseosa Cola", "Queita el oxido", "800", "15"},
	    {"B3", "Gaseosa Limón", "Gaseosa libre de limón. Sabor limón", "800", "15"},
	    {"B4", "Café Lattee", "Rico pero feo", "900", "10"},
	    {"B5", "Té Verde", "Color #00ff000", "600", "10"},
	    {"B6", "Energizante Mega Loco", "Te da patas", "1200", "10"},
	    {"B7", "Batido de Proteína", "Amigo del gimnasio", "1500", "8"},
	    {"B8", "Agua Saborizada Deliciosa", "Directa del lugar con mas sabor", "600", "20"},
	    {"B9", "Limonada", "Limón, jengibre, agua y nada mas. También, mucha azucar", "700", "15"},
	    {"B10", "Cerveza sin Alcohol", "Apta para el trabajo", "1000", "10"},
	    {"B11", "Refresco de Uva", "No sabemos porque la hacemos", "800", "15"},
	    {"B12", "Té Helado", "Refrescante sabor", "700", "15"},
	    {"B13", "Café Expreso", "Te pone las pilas", "900", "10"},
	    {"B14", "Batido de Frutas", "Frescas?", "1200", "8"},
	    {"C0", "Chocolate con Almendras", "La golosina del Diablo", "500", "25"},
	    {"C1", "Gomitas Frutales", "100% sabor frutal. No tiene frutas", "300", "30"},
	    {"C2", "Caramelos de Menta", "Frescor inmenso", "200", "40"},
	    {"C3", "Chicles de Frutas", "Infinito", "250", "35"},
	    {"C4", "Barra de Cereal", "Neutras y amigables", "400", "20"},
	    {"C5", "Galletas de Chocolate", "Libre de grasas malas", "450", "25"},
	    {"C6", "Chupetines", "El caramelo en un palito mas practico del mercado", "150", "50"},
	    {"C7", "Turrón de Maní", "El mas duro", "350", "30"},
	    {"D0", "Fruta Deshidratada", "La fruta mas fresca","600", "15"},
	    {"D1", "Nueces y Almendras", "Sano","800", "10"},
	    {"D2", "Barra de Proteína", "Proteína para dos semanas","1000", "8"},
	    {"D3", "Yogur Bebible", "Sabor natural","900", "10"},
	    {"D4", "Mix de Semillas", "Plantalas en tu jardin","700", "12"},
	    {"D5", "Snack de Garbanzos", "La gente lo come, creo","600", "15"},
	    {"D6", "Chips de Kale", "El sabor mas autentico","800", "10"},
	    {"D7", "Bebida de Almendra", "Puro sabor a almendra","1000", "8"},
	    {"D8", "Barra de Granola", "Llenadora.","700", "12"}
	};
	
	public void agregar() {
		for(int i = 0; i < products.length; i++) {
			id = products[1][i];
			nombreProducto = products[2][i];
			leyenda = products[3][i];
			precio = Integer.valueOf(products[4][i]);
			cantidad = Integer.valueOf(products[5][i]);
		}
	}
	
	public void asignarTipoProducto() {
		char t = id.charAt(0);
		TipoProducto AuxTipo = null;
		switch(t) {
		case 'A':
			AuxTipo = TipoProducto.SANGUCHE;
			break;
		case 'B':
			AuxTipo = TipoProducto.BEBIDA;
			break;
		case 'C':
			AuxTipo = TipoProducto.GOLOSINA;
			break;
		case 'D':
			AuxTipo = TipoProducto.SALUDABLE;
			break;
		}
	}
}
