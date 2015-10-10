import javax.sound.midi.*;
import java.util.Random;

class Midi 
{
	public static void main(String[] args) {
		
		try
		{
			Synthesizer s=MidiSystem.getSynthesizer();
				// System.out.println(s.toString());

			s.open();


			MidiChannel[] mc=s.getChannels();
				// System.out.println(mc.toString());
			
			Instrument[] in=s.getDefaultSoundbank().getInstruments();
				// System.out.println(in.toString());
			boolean b=s.loadInstrument(in[1]);
			// Random r=new Random();
				for (int i=48,j=0; i<96; i+=6,j%=9) {
				// System.out.println(b);
				// mc[0].noteOn(r.nextInt(120),100);
				mc[j].noteOn(i,100);
					Thread.sleep(1000);
				mc[j].allNotesOff();
					}
			// if(b)
			// {
			// }else {
			// 	System.out.println("not loaded");
			// }
		}catch (Exception e) {
			
		}
	}
}