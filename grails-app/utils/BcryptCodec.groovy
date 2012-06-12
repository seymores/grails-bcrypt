package bcrypt

import grails.plugin.bcrypt.BCrypt 


class BcryptCodec {

    static encode = { target ->
        BCrypt bcrypt = new BCrypt()
        bcrypt.hashpw(target, BCrypt.gensalt())
    }

}
