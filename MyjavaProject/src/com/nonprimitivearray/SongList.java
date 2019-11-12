package com.nonprimitivearray;

public class SongList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song[]playlist=new Song[3];
		playlist[0]=new Song("abc","x",123);
		playlist[1]=new Song("def","y",124);
		playlist[2]=new Song("ghi","z",125);
		for(int i=0;i<playlist.length;i++) {
			System.out.println("details: "+playlist[i].name+" "+playlist[i].singer+" "+playlist[i].likes);
		}
		for(Song x:playlist) {
			System.out.println("details: "+x.name+" "+x.singer+" "+x.likes);
		}

	}

}
