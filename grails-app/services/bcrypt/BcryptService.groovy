package bcrypt

import grails.plugin.bcrypt.BCrypt

class BcryptService {

    String hashPassword(String pass) {
        return BCrypt.hashpw(pass, BCrypt.gensalt())
    }

    String hashPassword(String pass, int genSaltRound) {
        return BCrypt.hashpw(pass, BCrypt.gensalt(genSaltRound))
    }

    boolean checkPassword(String pass, String hash) {
        return BCrypt.checkpw(pass, hash)
    }
}
