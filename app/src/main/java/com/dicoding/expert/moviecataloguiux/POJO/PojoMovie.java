package com.dicoding.expert.moviecataloguiux.POJO;

import android.os.Parcel;
import android.os.Parcelable;

public class PojoMovie implements Parcelable {
    private int ivmovie,tvrating;
    private String tvdescmovie,tvjudul;

    public int getIvmovie() {
        return ivmovie;
    }

    public void setIvmovie(int ivmovie) {
        this.ivmovie = ivmovie;
    }

    public int getTvrating() {
        return tvrating;
    }

    public void setTvrating(int tvrating) {
        this.tvrating = tvrating;
    }

    public String getTvdescmovie() {
        return tvdescmovie;
    }

    public void setTvdescmovie(String tvdescmovie) {
        this.tvdescmovie = tvdescmovie;
    }

    public String getTvjudul() {
        return tvjudul;
    }

    public void setTvjudul(String tvjudul) {
        this.tvjudul = tvjudul;
    }

    public PojoMovie(int ivmovie, int tvrating, String tvdescmovie, String tvjudul) {
        this.ivmovie = ivmovie;
        this.tvrating = tvrating;
        this.tvdescmovie = tvdescmovie;
        this.tvjudul = tvjudul;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.ivmovie);
        dest.writeInt(this.tvrating);
        dest.writeString(this.tvdescmovie);
        dest.writeString(this.tvjudul);
    }

    protected PojoMovie(Parcel in) {
        this.ivmovie = in.readInt();
        this.tvrating = in.readInt();
        this.tvdescmovie = in.readString();
        this.tvjudul = in.readString();
    }

    public static final Parcelable.Creator<PojoMovie> CREATOR = new Parcelable.Creator<PojoMovie>() {
        @Override
        public PojoMovie createFromParcel(Parcel source) {
            return new PojoMovie(source);
        }

        @Override
        public PojoMovie[] newArray(int size) {
            return new PojoMovie[size];
        }
    };
}
