/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if10k.pkg10119906.rizqyanandarusmana;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author senenngahenen
 * Nama     : Rizqy Ananda Rusmana
 * NIM      : 10119906
 * Kelas    : IF-10K
 */
public class Customer implements CustomerInvoice {
    private String name;
    private String email;
    private Boolean member;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isMember () {
        return this.member;
    }

    public void setMember(Boolean member) {
        this.member = member;
    }

    @Override
    public String currentTime() {
        int hari, detik, menit, jam, tanggal, bulan, tahun;

        GregorianCalendar date = new GregorianCalendar();

        String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        String[] namaHari = {"Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"};

        detik   = date.get(Calendar.SECOND);
        menit   = date.get(Calendar.MINUTE);
        jam     = date.get(Calendar.HOUR_OF_DAY);
        hari    = date.get(Calendar.DAY_OF_WEEK);
        tanggal = date.get(Calendar.DAY_OF_MONTH);
        bulan   = date.get(Calendar.MONTH);
        tahun   = date.get(Calendar.YEAR);

        return namaHari[hari - 1] + ", " + tanggal + " " + namaBulan[bulan] + " " + tahun + " " + jam + ":" + menit + ":" + detik;
    }
}
