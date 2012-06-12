grails-bcrypt
=============

Grails Simple BCrypt Plugin.
This plugin makes it easy for you to ise bcrypt to hash your password so you don't get pawned like linkedin, etc etc. :-D


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
assert service.checkPassword(t, x)

```


## License

Licensed under the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)
