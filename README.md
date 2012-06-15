grails-bcrypt
=============

Grails Simple BCrypt Plugin.
This plugin makes it easy for you to ise bcrypt to hash your password so you don't get pawned like linkedin, etc etc. :-D

This plugin provides a service class to generate and compare bcrypt hashes, and also a codec to generate bcrypt hash from String.


Quick Usage
============

``` java

// inject bcryptService the usual way
def bcryptService

String password = "my password"

// should give you a nice bcrypt hash
println password.encodeAsBcrypt()

// same thing but using the service class
def x = bcryptService.hashPassword(password)

// if true continue, else bye.
assert service.checkPassword(password, *hashed_password*)

```


## License

Licensed under the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)
