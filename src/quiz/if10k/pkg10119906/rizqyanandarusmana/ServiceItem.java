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
public interface ServiceItem {
    public void displayService();
    
    public float getPrice(int serviceItem);
    
    public boolean checkMemberStatus(String statusMember);
    
    public float getSale(boolean isMember, float parServicePrice);
}
