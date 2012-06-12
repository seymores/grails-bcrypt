package bcrypt

import grails.plugin.bcrypt.BCrypt


class BcryptService {

    def bcrypt = new BCrypt()

    def String hashPassword(String pass) {
        return  bcrypt.hashpw(pass, BCrypt.gensalt())
    }
    
    def String hashPassword(String pass, int genSaltRound) {
        return  bcrypt.hashpw(pass, BCrypt.gensalt(genSaltRound))
    }

    def boolean checkPassword(String pass, String hash) {
        return bcrypt.checkpw(pass, hash)
    }
}
