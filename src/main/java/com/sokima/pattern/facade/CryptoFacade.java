package com.sokima.pattern.facade;

import com.sokima.pattern.facade.crypto.email.EmailSender;
import com.sokima.pattern.facade.crypto.factory.CryptoFactory;
import com.sokima.pattern.facade.crypto.model.UserDao;
import com.sokima.pattern.facade.crypto.service.CryptoService;

/**
 * Facade Pattern.
 * Unite whole crypto module there.
 *
 * @author Roman Denysov
 */
public class CryptoFacade {
    private final CryptoDatabaseFacade cryptoDatabaseFacade;
    private final CryptoFactory cryptoFactory;
    private final UserDao userDao;
    private final CryptoService cryptoService;
    private final EmailSender emailSender;

    public CryptoFacade(CryptoDatabaseFacade cryptoDatabaseFacade, CryptoFactory cryptoFactory, UserDao userDao, CryptoService cryptoService, EmailSender emailSender) {
        this.cryptoDatabaseFacade = cryptoDatabaseFacade;
        this.cryptoFactory = cryptoFactory;
        this.userDao = userDao;
        this.cryptoService = cryptoService;
        this.emailSender = emailSender;
    }

    public void buyBitcoin() {
        // some impl
    }

    public void buyEthereum() {
        // some impl
    }

    public void sellCoin() {
        // some impl
    }

    public void collectAnalytics() {
        // some impl
    }

    // some impl
}
