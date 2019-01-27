/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.text.SimpleDateFormat;
import java.util.Date;




/**
 *
 * @author zhang
 */
public class AppointmentRequest extends WorkRequest{
    private Date FromDate;
    private Date ToDate;
    private String Type;

    public String getFromDateString() {
        SimpleDateFormat sdf=new SimpleDateFormat("HH:mm");
        return sdf.format(FromDate);
    }

    public void setFromDate(Date FromDate) {
        this.FromDate = FromDate;
    }

    public Date getFromDate() {
        return FromDate;
    }

    public Date getToDate() {
        return ToDate;
    }
    
    public String getToDateString() {
        SimpleDateFormat sdf=new SimpleDateFormat("HH:mm");
        return sdf.format(ToDate);
    }

    public void setToDate(Date ToDate) {
        this.ToDate = ToDate;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }
        @Override
    public String toString(){
        return Type;
    }
}
