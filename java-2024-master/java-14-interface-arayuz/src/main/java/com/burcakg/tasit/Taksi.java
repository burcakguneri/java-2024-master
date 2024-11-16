package com.burcakg.tasit;

import com.burcakg.base.Arac;
import com.burcakg.kural.IKanun;
import com.burcakg.kural.ITaksicilerDernegi;
import com.burcakg.kural.IUlastirmaBakanligi;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString (callSuper = true)
public class Taksi extends Arac implements IKanun, IUlastirmaBakanligi, ITaksicilerDernegi {

    @Override
    public int hizSiniri(int hizLimiti) {
        return hizLimiti;
    }

    @Override
    public String bakimDurumu(String durumBilgisi) {
        return durumBilgisi;
    }

    @Override
    public float tasitVergisi(float vergiMiktari) {
        return vergiMiktari;
    }

    @Override
    public byte emisyonDegeri(byte olcumOrani) {
        return olcumOrani;
    }


    @Override
    public Boolean ruhsatDurumu(Boolean durum) {
        return durum;
    }

    @Override
    public boolean ehliyetDurumu(boolean durum) {
        return false;
    }



    @Override
    public boolean dernekUyelikDurumu(boolean durumu) {
        return durumu;
    }

    @Override
    public float acilisUcreti(float para) {
        return para;
    }

}
