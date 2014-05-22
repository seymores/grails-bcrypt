grails-bcrypt
=============
This plugin provides a service class to generate and compare BCrypt hashes, and also a codec to generate a BCrypt hash from a String directly.

 Usage Example
============

```groovy
// dependency-inject the bcryptService
def bcryptService

String password = "my password"

// hash the password using the codec
println password.encodeAsBcrypt()

// hash the password using the service
def hashedPassword = bcryptService.hashPassword(password)

// compare the password with the hash to determine if the two are equivalent
// unlike most encryption algorithms, when using BCrypt you cannot determine this simply by comparing
// hashedPassword == password.encodeAsBcrypt()
// because the BCrypt hash of a given String is variable
assert bcryptService.checkPassword(password, hashedPassword)
```

## License

Licensed under the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)
