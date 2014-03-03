package lt.gb;

import android.annotation.SuppressLint;

public class MResources {

	SectorsForkFragment fr;

	@SuppressLint("NewApi")
	public MResources(SectorsForkFragment f) {
		fr = f;
	}

	@SuppressLint("NewApi")
	public PageItem[] getRes_1() {
		PageItem p_1_1 = new PageItem();
		{
			p_1_1.setSector("1");
			p_1_1.setIndex("1_1");
			p_1_1.setTitle(fr.getString(R.string.t_1));
			p_1_1.setDescription(fr.getString(R.string.p_1_1));
			
			ImageConfig[] images = new ImageConfig[6];
			images[0] = new ImageConfig(R.drawable.land_1_1,true);
			images[1] = new ImageConfig(R.drawable.land_1_1_1 ,true);
			images[2] = new ImageConfig(R.drawable.land_1_1_2 ,false);
			images[3] = new ImageConfig(R.drawable.land_1_1_3 ,false);
			images[4] = new ImageConfig(R.drawable.land_1_1_4 ,false);
			images[5] = new ImageConfig(R.drawable.land_1_1_5 ,false);
			p_1_1.setImages(images);	

			int[] p_1_1a = new int[1];
			p_1_1a[0] = R.drawable.port_1_1;
			p_1_1.setImgPort(p_1_1a);

			p_1_1.setSoundRes(R.raw.s_1);
		}
		
		
		PageItem p_1_2 = new PageItem();
		{	
			p_1_2.setSector("1");
			p_1_2.setIndex("1_2");
			p_1_2.setTitle(fr.getString(R.string.t_1));
			p_1_2.setDescription(fr.getString(R.string.p_1_2));
			
			ImageConfig[] images = new ImageConfig[19];
			images[0] = new ImageConfig(R.drawable.land_1_2 ,true);
			images[1] = new ImageConfig(R.drawable.land_1_2_1,false);
			images[2] = new ImageConfig(R.drawable.land_1_2_2,false);
			images[3] = new ImageConfig(R.drawable.land_1_2_3,false);
			images[4] = new ImageConfig(R.drawable.land_1_2_4,false);
			images[5] = new ImageConfig(R.drawable.land_1_2_5,false);
			images[6] = new ImageConfig(R.drawable.land_1_2_6,false);
			images[7] = new ImageConfig(R.drawable.land_1_2_7,false);
			images[8] = new ImageConfig(R.drawable.land_1_2_8,false);
			images[9] = new ImageConfig(R.drawable.land_1_2_9,false);
			images[10] = new ImageConfig(R.drawable.land_1_2_10,false);
			images[11] = new ImageConfig(R.drawable.land_1_2_11,false);
			images[12] = new ImageConfig(R.drawable.land_1_2_12,false);
			images[13] = new ImageConfig(R.drawable.land_1_2_13,false);
			images[14] = new ImageConfig(R.drawable.land_1_2_14,false);
			images[15] = new ImageConfig(R.drawable.land_1_2_15,false);
			images[16] = new ImageConfig(R.drawable.land_1_2_16,true);
			images[17] = new ImageConfig(R.drawable.land_1_2_17,true);
			images[18] = new ImageConfig(R.drawable.land_1_2_18,true);
			p_1_2.setImages(images);
			
			int[] p_1_2a = new int[1];
			p_1_2a[0] = R.drawable.land_1_2;
			p_1_2.setImgPort(p_1_2a);

			p_1_2.setSoundRes(R.raw.s_2);
		}
		PageItem p_1_3 = new PageItem();
		{
			p_1_3.setSector("1");
			p_1_3.setIndex("1_3");
			p_1_3.setTitle(fr.getString(R.string.t_1));
			p_1_3.setDescription(fr.getString(R.string.p_1_3));

			int[] l_1_3a = new int[1];
			l_1_3a[0] = R.drawable.land_1_3;
			p_1_3.setImgPort(l_1_3a);
			
			int[] p_1_3a = new int[1];
			p_1_3a[0] = R.drawable.port_1_3;
			p_1_3.setImgLand(p_1_3a);
			
			p_1_3.setImgPort(p_1_3a);
			p_1_3.setSoundRes(R.raw.s_3);
		}
		PageItem p_1_4 = new PageItem();
		{
			p_1_4.setSector("1");
			p_1_4.setIndex("1_4");
			p_1_4.setTitle(fr.getString(R.string.t_1));
			p_1_4.setDescription(fr.getString(R.string.p_1_4));
			
			int[] l_1_4a = new int[1];
			l_1_4a[0] = R.drawable.land_1_4;
			p_1_4.setImgPort(l_1_4a);
			
			int[] p_1_4a = new int[1];
			p_1_4a[0] = R.drawable.port_1_4;
			p_1_4.setImgLand(p_1_4a);
			
			p_1_4.setSoundRes(R.raw.s_4);
		}
		
		PageItem[] items_1 = new PageItem[4];
		items_1[0] = p_1_1;
		items_1[1] = p_1_2;
		items_1[2] = p_1_3;
		items_1[3] = p_1_4;
		
		return items_1;
	}

	@SuppressLint("NewApi")
	public PageItem[] getRes_2() {

		PageItem p_2_1 = new PageItem();
		p_2_1.setSector("2");
		p_2_1.setIndex("2_1");
		p_2_1.setTitle(fr.getString(R.string.t_2));
		p_2_1.setDescription(fr.getString(R.string.p_2_1));
		
		int[] l_2_1a = new int[1];
		l_2_1a[0] = R.drawable.land_2_1;
		p_2_1.setImgPort(l_2_1a);
		
		int[] p_2_1a = new int[1];
		p_2_1a[0] = R.drawable.port_2_1;
		p_2_1.setImgLand(p_2_1a);
		
		p_2_1.setSoundRes(R.raw.s_1);

		PageItem p_2_2 = new PageItem();
		p_2_2.setSector("2");
		p_2_2.setIndex("2_2");
		p_2_2.setTitle(fr.getString(R.string.t_2));
		p_2_2.setDescription(fr.getString(R.string.p_2_2));
		
		int[] l_2_2a = new int[1];
		l_2_2a[0] = R.drawable.land_2_2;
		p_2_2.setImgPort(l_2_2a);
		
		int[] p_2_2a = new int[1];
		p_2_2a[0] = R.drawable.port_2_2;
		p_2_2.setImgLand(p_2_2a);
		
		p_2_2.setSoundRes(R.raw.s_1);

		PageItem p_2_3 = new PageItem();
		p_2_3.setSector("2");
		p_2_3.setIndex("2_3");
		p_2_3.setTitle(fr.getString(R.string.t_2));
		p_2_3.setDescription(fr.getString(R.string.p_2_3));
		
		int[] l_2_3a = new int[1];
		l_2_3a[0] = R.drawable.land_2_3;
		p_2_3.setImgPort(l_2_3a);
		
		int[] p_2_3a = new int[1];
		p_2_3a[0] = R.drawable.port_2_3;
		p_2_3.setImgLand(p_2_3a);		

		p_2_3.setSoundRes(R.raw.s_1);

		PageItem[] items_2 = new PageItem[3];

		items_2[0] = p_2_1;
		items_2[1] = p_2_2;
		items_2[2] = p_2_3;

		return items_2;
	}

	@SuppressLint("NewApi")
	public PageItem[] getRes_3() {

		PageItem p_3_1 = new PageItem();
		p_3_1.setSector("3");
		p_3_1.setIndex("3_1");
		p_3_1.setTitle(fr.getString(R.string.t_3));
		p_3_1.setDescription(fr.getString(R.string.p_3_1));
		//p_3_1.setImgLand(new int[R.drawable.land_3_1]);
		//p_3_1.setImgPort(new int[R.drawable.port_3_1]);
		p_3_1.setSoundRes(R.raw.s_1);

		PageItem p_3_2 = new PageItem();
		p_3_2.setSector("3");
		p_3_2.setIndex("3_2");
		p_3_2.setTitle(fr.getString(R.string.t_3));
		p_3_2.setDescription(fr.getString(R.string.p_3_2));
		//p_3_2.setImgLand(new int[R.drawable.land_3_3]);
		//p_3_2.setImgPort(new int[R.drawable.port_3_3]);
		p_3_2.setSoundRes(R.raw.s_1);

		PageItem p_3_3 = new PageItem();
		p_3_3.setSector("3");
		p_3_3.setIndex("3_3");
		p_3_3.setTitle(fr.getString(R.string.t_3));
		p_3_3.setDescription(fr.getString(R.string.p_3_3));
		//p_3_3.setImgLand(new int[R.drawable.land_3_2]);
		//p_3_3.setImgPort(new int[R.drawable.port_3_2]);
		p_3_3.setSoundRes(R.raw.s_1);

		PageItem[] items_3 = new PageItem[3];

		items_3[0] = p_3_1;
		items_3[1] = p_3_2;
		items_3[2] = p_3_3;

		return items_3;
	}

	@SuppressLint("NewApi")
	public PageItem[] getRes_4() {

		PageItem p_4_1 = new PageItem();
		p_4_1.setSector("4");
		p_4_1.setIndex("4_1");
		p_4_1.setTitle(fr.getString(R.string.t_4));
		p_4_1.setDescription(fr.getString(R.string.p_4_1));
		//p_4_1.setImgLand(new int[R.drawable.land_4_1]);
		//p_4_1.setImgPort(new int[R.drawable.port_4_1]);

		PageItem p_4_2 = new PageItem();
		p_4_2.setSector("4");
		p_4_2.setIndex("4_2");
		p_4_2.setTitle(fr.getString(R.string.t_4));
		p_4_2.setDescription(fr.getString(R.string.p_4_2));
		p_4_2.setImgLand(new int[R.drawable.land_4_2]);
		p_4_2.setImgPort(new int[R.drawable.port_4_2]);

		PageItem p_4_3 = new PageItem();
		p_4_3.setSector("4");
		p_4_3.setIndex("4_3");
		p_4_3.setTitle(fr.getString(R.string.t_4));
		p_4_3.setDescription(fr.getString(R.string.p_4_3));
		//p_4_3.setImgLand(new int[R.drawable.land_4_3]);
		//p_4_3.setImgPort(new int[R.drawable.port_4_3]);

		PageItem p_4_4 = new PageItem();
		p_4_4.setSector("4");
		p_4_4.setIndex("4_4");
		p_4_4.setTitle(fr.getString(R.string.t_4));
		p_4_4.setDescription(fr.getString(R.string.p_4_4));
		//p_4_4.setImgLand(new int[R.drawable.land_4_4]);
		//p_4_4.setImgPort(new int[R.drawable.port_4_4]);

		PageItem[] items_4 = new PageItem[4];

		items_4[0] = p_4_1;
		items_4[1] = p_4_2;
		items_4[2] = p_4_3;
		items_4[3] = p_4_4;

		return items_4;
	}

	@SuppressLint("NewApi")
	public PageItem[] getRes_5() {

		PageItem p_5_1 = new PageItem();
		p_5_1.setSector("5");
		p_5_1.setIndex("5_1");
		p_5_1.setTitle(fr.getString(R.string.t_5));
		p_5_1.setDescription(fr.getString(R.string.p_5_1));
		//p_5_1.setImgLand(new int[R.drawable.land_5_1]);
		//p_5_1.setImgPort(new int[R.drawable.port_5_1]);

		PageItem p_5_2 = new PageItem();
		p_5_2.setSector("5");
		p_5_2.setIndex("5_2");
		p_5_2.setTitle(fr.getString(R.string.t_5));
		p_5_2.setDescription(fr.getString(R.string.p_5_2));
		//p_5_2.setImgLand(new int[R.drawable.land_5_2]);
		//p_5_2.setImgPort(new int[R.drawable.port_5_2]);

		PageItem p_5_3 = new PageItem();
		p_5_3.setSector("5");
		p_5_3.setIndex("5_3");
		p_5_3.setTitle(fr.getString(R.string.t_5));
		p_5_3.setDescription(fr.getString(R.string.p_5_3));
		//p_5_3.setImgLand(new int[R.drawable.land_5_3]);
		//p_5_3.setImgPort(new int[R.drawable.port_5_3]);

		PageItem p_5_4 = new PageItem();
		p_5_4.setSector("5");
		p_5_4.setIndex("5_4");
		p_5_4.setTitle(fr.getString(R.string.t_5));
		p_5_4.setDescription(fr.getString(R.string.p_5_4));
		//p_5_4.setImgLand(new int[R.drawable.land_5_1]);
		//p_5_4.setImgPort(new int[R.drawable.port_5_1]);

		PageItem[] items_5 = new PageItem[4];

		items_5[0] = p_5_1;
		items_5[1] = p_5_2;
		items_5[2] = p_5_3;
		items_5[3] = p_5_4;

		return items_5;
	}

}
