package bcrypt

import grails.plugin.bcrypt.BCrypt

class BcryptCodec {

    static encode = { target ->
        BCrypt.hashpw(target, BCrypt.gensalt())
    }
}
