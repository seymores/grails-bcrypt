grails-bcrypt
=============

Grails Simple BCrypt Plugin

Usage

def service = new bcrypt.BcryptService()

String t = "my password"

println t.encodeAsBcrypt()
def x = service.hashPassword(t)

assert service.checkPassword(t, x)
