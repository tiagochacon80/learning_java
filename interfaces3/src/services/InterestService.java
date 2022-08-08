package services;

import java.security.InvalidParameterException;

public interface InterestService {

    double getInterestService();

    default double payment(double amount, int months) {
        if (months < 1) {
            throw new InvalidParameterException("Months must be greater tahan zero");
        }
        return amount * Math.pow(1.0 + getInterestService() / 100.00, months);
    }
}
