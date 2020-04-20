package com.second.movie;

public class AmountDiscountPolicy implements DiscountPolicy {
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return null;
    }
    /*public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }*/
}
