# XXTEA for Java

<a href="https://github.com/xxtea/">
    <img src="https://avatars1.githubusercontent.com/u/6683159?v=3&s=86" alt="XXTEA logo" title="XXTEA" align="right" />
</a>

[![Join the chat at https://gitter.im/xxtea/xxtea-java](https://img.shields.io/badge/GITTER-join%20chat-green.svg)](https://gitter.im/xxtea/xxtea-java?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.xxtea/xxtea-java/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.xxtea/xxtea-java/)
[![GitHub release](https://img.shields.io/github/release/xxtea/xxtea-java.svg)](https://github.com/xxtea/xxtea-java/releases)
[![License](https://img.shields.io/github/license/xxtea/xxtea-java.svg)](http://opensource.org/licenses/MIT)

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
