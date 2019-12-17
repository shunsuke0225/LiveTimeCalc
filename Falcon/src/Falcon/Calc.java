/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Falcon;

/**
 *
 * @author C0117042
 */
public class Calc {

    //全体の時間を計算
    public double allTimeCalc(double liveTime, double rehearsalTime, double band, double phase, double breakTime, double gap) {
        /*        if (liveTime == 0 || rehearsalTime == 0 || band == 0 || phase == 0 || breakTime == 0) {
            liveTime = 0;
            rehearsalTime = 0;
            band = 0;
            phase = 0;
            breakTime = 0;
        }
         */ return ((liveTime + rehearsalTime) * band + (phase - 1) *  breakTime + gap);
    }

    //リハーサルの時間の逆算
    public double rehearsalTimeCalc(double allTime, double liveTime, double band, double phase, double breakTime, double gap) {
        return ( (((allTime - (phase - 1) * breakTime - gap) / band) - liveTime));
    }

    //本番の時間の逆算
    public double liveTimeCalc(double allTime, double rehearsalTime, double band, double phase, double breakTime, double gap) {
        return ( (((allTime - (phase - 1) * breakTime - gap) / band) - rehearsalTime));
    }

    //バンド数の逆算
    public double bandCalc(double allTime, double rehearsalTime, double liveTime, double phase, double breakTime, double gap) {
        return ( ((allTime - (phase - 1) * breakTime - gap) / (liveTime + rehearsalTime)));
    }

    //休憩時間の逆算
    public double breakTimeCalc(double allTime, double rehearsalTime, double liveTime, double phase, double band, double gap) {
        return ( ((allTime - (liveTime + rehearsalTime) * band - gap) / (phase - 1)));
    }

    //部数の逆算
    public double phaseCalc(double allTime, double rehearsalTime, double liveTime, double breakTime, double band, double gap) {
        return ( ((((allTime - (liveTime + rehearsalTime) * band-gap) / breakTime)+1)));
    }
    
    //本番とリハとの間の逆算
    public double gapCalc(double allTime, double rehearsalTime, double liveTime, double breakTime, double band, double phase) {
        return (allTime - (liveTime + rehearsalTime) * band - (phase-1) * breakTime);
    }

}
