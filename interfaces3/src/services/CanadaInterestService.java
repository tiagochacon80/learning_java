package services;

import java.security.InvalidParameterException;

public class CanadaInterestService implements InterestService {

    private double interestRate;

    public CanadaInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestService() {
        return interestRate;
    }

}
