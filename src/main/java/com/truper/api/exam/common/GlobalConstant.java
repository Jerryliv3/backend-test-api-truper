package com.truper.api.exam.common;

public class GlobalConstant {

	/* ROUTER API LISTA_COMPRAS */
	public static final String API_LISTACOMPRAS = "/v1/lista-compras";
	public static final String GET_LISTACOMPRAS = "/get/{id}";
	public static final String UPDATE_LISTACOMPRAS = "/update/{id}";
	public static final String SAVE_LISTACOMPRAS = "/save";
	public static final String DELETE_LISTACOMPRAS = "/delete/{id}";
	
	/* ROUTER API LOGIN */
	public static final String API_LOGIN = "/v1/login";
	public static final String GET_TOKEN_LOGIN = "/get-token";
	public static final String SEC_API_LISTACOMPRAS = "/v1/lista-compras/*";
	public static final String TYPE = "Beare";
	
	/* MESSAGES API LISTA_COMPRAS */
	public static final String SUCCESS = "Successful";
	public static final String UNSUCCESS = "Unsuccessful";
	public static final int CODE_SUCCESS = 1;
	public static final int CODE_UNSUCCESS = 0;
}
