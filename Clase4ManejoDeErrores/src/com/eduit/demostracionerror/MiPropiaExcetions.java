package com.eduit.demostracionerror;

public class MiPropiaExcetions extends Exception {

	String mensajeError ;
	
	public MiPropiaExcetions(String msg) {
		mensajeError = msg;
	}
	
	@Override
	public String getMessage() {

		return mensajeError;
	}

}
