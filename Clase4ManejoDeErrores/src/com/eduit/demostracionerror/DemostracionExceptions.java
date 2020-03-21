package com.eduit.demostracionerror;

public class DemostracionExceptions {
	public static void main(String[] args) {
		int nums[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int denom[] = { 2, 0, 4, 4, 0, 8 };

		// TRY CATCH ANIDADOS EXAMPLE

		try {// try externo
			for (int i = 0; i < nums.length; i++) {
				try {// try interno
					System.out.println(nums[i] + " / " + denom[i] + " = " + nums[i] / denom[i]);
				} catch (ArithmeticException e) {
					// capturo exception en el try interno
					System.out.println("no se puede dividir por cero en los num reales");
				}

			}

		} catch (ArrayIndexOutOfBoundsException e) {
			// Capturo una exception en el try externo
			System.out.println("ERRRRRRORRRRR programa finalizado ");
		}

//		for (int i = 0; i < nums.length; i++) {
//			try {
//				System.out.println(nums[i] + " / " + denom[i] + " = " + nums[i] / denom[i]);
//			} catch (ArrayIndexOutOfBoundsException e) {
//				// Capturamos la exception de la sub clase
//				System.out.println("no se encontro ningun elemento en los denominadores ");
//
//			} catch (Exception e) {
//				// Capturamos la exception de la super clase
//				System.out.println("alguna exception ocurrio ");
//				System.out.println("mensaje :" + e.getMessage());
//			}
//
//		}
	}
}
