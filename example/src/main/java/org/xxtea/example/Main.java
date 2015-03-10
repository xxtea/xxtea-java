package org.xxtea.example;

import org.xxtea.XXTEA;

public class Main {
    public static void main(String[] args) {
        String str = "Hello World! 你好，中国！";
        String key = "1234567890";
        String encrypt_data = XXTEA.encryptToBase64String(str, key);
        System.out.println(encrypt_data);
        assert("QncB1C0rHQoZ1eRiPM4dsZtRi9pNrp7sqvX76cFXvrrIHXL6".equals(encrypt_data));
        String decrypt_data = XXTEA.decryptBase64StringToString(encrypt_data, key);
        assert(str.equals(decrypt_data));
    }
}
