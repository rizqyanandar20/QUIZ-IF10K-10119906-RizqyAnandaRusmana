/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if10k.pkg10119906.rizqyanandarusmana;

/**
 *
 * @author senenngahenen
 * Nama     : Rizqy Ananda Rusmana
 * NIM      : 10119906
 * Kelas    : IF-10K
 */
public class ServicePrice implements ServiceItem {
    private float priceService;
    private float discount;

    public float getPriceService () {
        return this.priceService;
    }

    public void setPriceService(float priceService) {
        this.priceService = priceService;
    }

    public void displayService() {
        System.out.println("*************************");
        System.out.println("#***Rock n Roll Haircut***#");
        System.out.println("#*******Service List******#");
        System.out.println("1. Haircut : IDR 45K");
        System.out.println("2. Haircut + Hairwash: IDR 55K");
        System.out.println("3. Hairwash Only : IDR 15K");
        System.out.println("#*************************#");
        System.out.print("Choose (1/2/3):");
    }

    @Override
    public float getPrice (int serviceItem) {
        switch (serviceItem) {
            case 1: return 45000;
            case 2: return 55000;
            case 3: return 15000;
            default: return 0;
        }
    }

    public boolean checkMemberStatus (String statusMember) {
        if (statusMember.equals("member")) return true;
        else return false;
    }

    public float getSale (boolean isMember, float parServicePrice) {
        if (isMember) return parServicePrice * 0.1f;
        return 0f;
    }

    public float getTotalPay (float priceService, float discount) {
        return priceService - discount;
    }
}