# XXTEA for Java

## Introduction

XXTEA is a fast and secure encryption algorithm. This is a XXTEA library for Java.

It is different from the original XXTEA encryption algorithm. It encrypts and decrypts byte[] instead of 32bit integer array, and the key is also the byte[].

In addition to providing the API of byte[] encryption and decryption, it also provides some methods to handle string and Base64 encode.

## Usage

```java
package org.xxtea.test;

import org.xxtea.XXTEA;

public class Main {
    public static void main(String[] args) {
        String str = "Hello World! 你好，中国！";
        String key = "1234567890";
        byte[] encrypt_data = XXTEA.encrypt(str, key);
        String decrypt_data = XXTEA.decryptToString(encrypt_data, key);
        assert(str.equals(decrypt_data));
    }
}
```
