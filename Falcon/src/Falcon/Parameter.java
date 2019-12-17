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
public class Parameter {
    
    private double rehearsalTime;  //リハーサルの時間
    private double liveTime;       //本番の時間
    private double bandNum;        //バンド数
    private double phase;          //部数
    private double breakTime;      //休憩時間
    private double gap;            //本番とリハの間

    private double allTime;//全体の時間
    private double ideal;

    private int mode = 0;//モード

    public Parameter(){
    this.mode = 0;//モード
   
    }
    
    /**
     * @return the rehearsalTime
     */
    public double getRehearsalTime() {
        return rehearsalTime;
    }

    /**
     * @param rehearsalTime the rehearsalTime to set
     */
    public void setRehearsalTime(double rehearsalTime) {
        this.rehearsalTime = rehearsalTime;
    }

    /**
     * @return the liveTime
     */
    public double getLiveTime() {
        return liveTime;
    }

    /**
     * @param liveTime the liveTime to set
     */
    public void setLiveTime(double liveTime) {
        this.liveTime = liveTime;
    }

    /**
     * @return the bandNum
     */
    public double getBandNum() {
        return bandNum;
    }

    /**
     * @param bandNum the bandNum to set
     */
    public void setBandNum(double bandNum) {
        this.bandNum = bandNum;
    }

    /**
     * @return the phase
     */
    public double getPhase() {
        return phase;
    }

    /**
     * @param phase the phase to set
     */
    public void setPhase(double phase) {
        this.phase = phase;
    }

    /**
     * @return the breakTime
     */
    public double getBreakTime() {
        return breakTime;
    }

    /**
     * @param breakTime the breakTime to set
     */
    public void setBreakTime(double breakTime) {
        this.breakTime = breakTime;
    }

    /**
     * @return the allTime
     */
    public double getAllTime() {
        return allTime;
    }

    /**
     * @param allTime the allTime to set
     */
    public void setAllTime(double allTime) {
        this.allTime = allTime;
    }

    /**
     * @return the mode
     */
    public int getMode() {
        return mode;
    }

    /**
     * @param mode the mode to set
     */
    public void setMode(int mode) {
        this.mode = mode;
    }
//モード

    /*
    0=全体の時間を計算(デフォルト)
    1=リハーサルの時間を計算
    2=本番の時間を計算
    3=休憩の時間を計算
    4=部数の時間を計算
    5=バンド数の時間を計算
    6=本番/リハーサル間の間の時間
*/

    /**
     * @return the ideal
     */
    public double getIdeal() {
        return ideal;
    }

    /**
     * @param ideal the ideal to set
     */
    public void setIdeal(double ideal) {
        this.ideal = ideal;
    }

    /**
     * @return the gap
     */
    public double getGap() {
        return gap;
    }

    /**
     * @param gap the gap to set
     */
    public void setGap(double gap) {
        this.gap = gap;
    }
    
}
