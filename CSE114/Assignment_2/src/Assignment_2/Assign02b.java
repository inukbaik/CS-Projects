package Assignment_2;

// CSE 114, Assignment 2
//  Name: Inuk Baik
//  SBU ID number: 112493042
//  SBU email: inuk.baik@stonybrook.edu

public class Assign02b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		runTests();
		System.out.println("[Done]");
	}
	
	// Define encrypt() : 	public static String encrypt(String plain, int key) 
	public static String encrypt(String plain, int key) {
		if(key >=0 && key <= 25) {
			String upperPlain = plain.toUpperCase();
			String newString = "";
			for(int i = 0; i < upperPlain.length(); i++) {
				if(Character.isLetter(upperPlain.charAt(i))) {
					int newCharacter = upperPlain.charAt(i) + key;
					if(newCharacter > 90) {
						newCharacter -= 26;
						newString += (char)newCharacter;
					}
					else {
						newString += (char)newCharacter;
					}
				}
				else {
					newString += upperPlain.charAt(i);
				}
			}
			return newString;
		}
		else {
			System.out.println("Error : Key is not between 0 and 25");
			return "";
		}
	}
	
	
	// Define decrypt() : 	public static String decrypt(String cipher, int key)
	
	public static String decrypt(String cipher, int key) {
		if(key >= 0 && key <= 25) {
			String upperCipher = cipher.toUpperCase();
			String newString = "";
			for(int i = 0; i < upperCipher.length(); i++) {
				if(Character.isLetter(upperCipher.charAt(i))) {
					int newCharacter = upperCipher.charAt(i) - key;
					if(newCharacter < 65) {
						newCharacter += 26;
						newString += (char)newCharacter;
					}
					else {
						newString += (char)newCharacter;
					}
				}
				else {
					newString += upperCipher.charAt(i);
				}
			}
			return newString;
		}
		else {
			System.out.println("Error : Key is not between 0 and 25");
			return "";
		}
	}
	

	public static void runTests() {
		String test1 = "This is a test.";
		String test2 = "1. Here is a string with non-alpha characters";
		String test3 = "Another 'Wierd' string!!!";
		String test4 = "(a + 1) * x - 7;";
		String test1Encrypted3 = "WKLV LV D WHVW.";
		String test2Encrypted3 = "1. KHUH LV D VWULQJ ZLWK QRQ-DOSKD FKDUDFWHUV";
		String test3Encrypted3 = "DQRWKHU 'ZLHUG' VWULQJ!!!";
		String test4Encrypted3 = "(D + 1) * A - 7;";
		String test1Encrypted13 = "GUVF VF N GRFG.";
		String test2Encrypted10 = "1. ROBO SC K CDBSXQ GSDR XYX-KVZRK MRKBKMDOBC";
		String test3Encrypted10 = "KXYDROB 'GSOBN' CDBSXQ!!!";
		String test4Encrypted5 = "(F + 1) * C - 7;";

		
		String outTest1 = encrypt(test1, 3);
		String outTest2 = encrypt(test2, 3);
		String outTest3 = encrypt(test3, 3);
		String outTest4 = encrypt(test4, 3);
		String outTest5 = encrypt(test1, 13);
		String outTest6 = encrypt(test2, 10);
		String outTest7 = encrypt(test3, 10);
		String outTest8 = encrypt(test4, 5);
		String outTest9 = encrypt(test1, -5);
		String outTest10 = encrypt(test1, 30);
		
		String retPlain1 = decrypt(outTest1, 3);
		String retPlain2 = decrypt(outTest2, 3);
		String retPlain3 = decrypt(outTest3, 3);
		String retPlain4 = decrypt(outTest4, 3);
		String retPlain5 = decrypt(outTest5, 13);
		String retPlain6 = decrypt(outTest6, 10);
		String retPlain7 = decrypt(outTest7, 10);
		String retPlain8 = decrypt(outTest8, 5);
		String retPlain9 = decrypt(outTest1, -5);
		String retPlain10 = decrypt(outTest1, 30);

		int passed = 0;
		int failed = 0;
		
		System.out.print("Test Case 1:");
		System.out.print("   Encrypt (key=3): " + test1 + " => " + outTest1);
		if (outTest1.equals(test1Encrypted3)) {
			System.out.println(" => Passed");
			passed++;
		} else {
			System.out.println(" => Failed");
			failed++;
		}
	
		System.out.print("Test Case 2:");
		System.out.print("   Encrypt (key=3): " + test2 + " => " + outTest2);
		if (outTest2.equals(test2Encrypted3)) {
			System.out.println(" => Passed");
			passed++;
		} else {
			System.out.println(" => Failed");
			failed++;
		}
		
		
		System.out.print("Test Case 3:");
		System.out.print("   Encrypt (key=3): " + test3 + " => " + outTest3);
		
		if (outTest3.equals(test3Encrypted3)) {
			System.out.println(" => Passed");
			passed++;
		} else {
			System.out.println(" => Failed");
			failed++;
		}
		
		System.out.print("Test Case 4:");
		System.out.print("   Encrypt (key=3): " + test4 + " => " + outTest4);

		if (outTest4.equals(test4Encrypted3)) {
			System.out.println(" => Passed");
			passed++;
		} else {
			System.out.println(" => Failed");
			failed++;
		}
		
		System.out.print("Test Case 5:");
		System.out.print("   Encrypt (key=13): " + test1 + " => " + outTest5);

		if (outTest5.equals(test1Encrypted13)) {
			System.out.println(" => Passed");
			passed++;
		} else {
			System.out.println(" => Failed");
			failed++;
		}
		
		
		System.out.print("Test Case 6:");
		System.out.print("   Encrypt (key=10): " + test2 + " => " + outTest6);

		if (outTest6.equals(test2Encrypted10)) {
			System.out.println(" => Passed");
			passed++;
		} else {
			System.out.println(" => Failed");
			failed++;
		}
		
		System.out.print("Test Case 7:");
		System.out.print("   Encrypt (key=10): " + test3 + " => " + outTest7);

		if (outTest7.equals(test3Encrypted10)) {
			System.out.println(" => Passed");
			passed++;
		} else {
			System.out.println(" => Failed");
			failed++;
		}

		System.out.print("Test Case 8:");
		System.out.print("   Encrypt (key=5): " + test4 + " => " + outTest8);

		if (outTest8.equals(test4Encrypted5)) {
			System.out.println(" => Passed");
			passed++;
		} else {
			System.out.println(" => Failed");
			failed++;
		}

		System.out.print("Test Case 9:");
		System.out.print("   Decrypt (key=3): " + outTest1 + " => " + retPlain1);
		
		if (test1.toUpperCase().equals(retPlain1)) {
			System.out.println(" => Passed");
			passed++;
		} else {
			System.out.println(" => Failed");
			failed++;
		}

		System.out.print("Test Case 10:");
		System.out.print("   Decrypt (key=3): " + outTest2 + " => " + retPlain2);
		
		if (test2.toUpperCase().equals(retPlain2)) {
			System.out.println(" => Passed");
			passed++;
		} else {
			System.out.println(" => Failed");
			failed++;
		}

		System.out.print("Test Case 11:");
		System.out.print("   Decrypt (key=3): " + outTest3 + " => " + retPlain3);
		
		if (test3.toUpperCase().equals(retPlain3)) {
			System.out.println(" => Passed");
			passed++;
		} else {
			System.out.println(" => Failed");
			failed++;
		}

		System.out.print("Test Case 12:");
		System.out.print("   Decrypt (key=3): " + outTest4 + " => " + retPlain4);

		if (test4.toUpperCase().equals(retPlain4)) {
			System.out.println(" => Passed");
			passed++;
		} else {
			System.out.println(" => Failed");
			failed++;
		}

		System.out.print("Test Case 13:");
		System.out.print("   Decrypt (key=13): " + outTest5 + " => " + retPlain5);
		
		if (test1.toUpperCase().equals(retPlain5)) {
			System.out.println(" => Passed");
			passed++;
		} else {
			System.out.println(" => Failed");
			failed++;
		}

		System.out.print("Test Case 14:");
		System.out.print("   Decrypt (key=10): " + outTest6 + " => " + retPlain1);

		if (test2.toUpperCase().equals(retPlain6)) {
			System.out.println(" => Passed");
			passed++;
		} else {
			System.out.println(" => Failed");
			failed++;
		}
		
		System.out.print("Test Case 15:");
		System.out.print("   Decrypt (key=10): " + outTest7 + " => " + retPlain7);

		if (test3.toUpperCase().equals(retPlain7)) {
			System.out.println(" => Passed");
			passed++;
		} else {
			System.out.println(" => Failed");
			failed++;
		}
		
		System.out.print("Test Case 16:");
		System.out.print("   Decrypt (key=5): " + outTest8 + " => " + retPlain8);
		
		if (test4.toUpperCase().equals(retPlain8)) {
			System.out.println(" => Passed");
			passed++;
		} else {
			System.out.println(" => Failed");
			failed++;
		}
		
		System.out.print("Test Case 17:");
		System.out.print("   Encrypt (key=-5): " + test1 + " => " + outTest9);
		
		if (outTest9.toUpperCase().equals("")) {
			System.out.println(" => Passed");
			passed++;
		} else {
			System.out.println(" => Failed");
			failed++;
		}
		System.out.print("Test Case 18:");
		System.out.print("   Encrypt (key=30): " + test1 + " => " + outTest10);
		
		if (outTest10.toUpperCase().equals("")) {
			System.out.println(" => Passed");
			passed++;
		} else {
			System.out.println(" => Failed");
			failed++;
		}
		System.out.print("Test Case 19:");
		System.out.print("   Decrypt (key=-5): " + outTest1 + " => " + retPlain9);
		
		if (retPlain9.toUpperCase().equals("")) {
			System.out.println(" => Passed");
			passed++;
		} else {
			System.out.println(" => Failed");
			failed++;
		}
		
		System.out.print("Test Case 20:");
		System.out.print("   Decrypt (key=30): " + outTest1 + " => " + retPlain10);
		
		if (retPlain10.toUpperCase().equals("")) {
			System.out.println(" => Passed");
			passed++;
		} else {
			System.out.println(" => Failed");
			failed++;
		}
		
		System.out.println("\nSummary: ");
		System.out.println("   Passed: " + passed);
		System.out.println("   Failed: " + failed);
	
		if (failed > 0) {
			System.out.println("\n   ***** At least 1 test failed! *****");
		}
		
	}

}
