import javax.sound.midi.*;
class soundTest
{	
	void play()
	{
		try
		{
			Sequencer player=MidiSystem.getSequencer();
			player.open();
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track=seq.createTrack();
			
			for(int i=0,k=0;i<120;i++,k=i%9)
			{if(i%3==0)
				{
				ShortMessage a=new ShortMessage();
				a.setMessage(144,3,i,100);
				MidiEvent noteOn=new MidiEvent(a,i);
				track.add(noteOn);
			
				ShortMessage b=new ShortMessage();
				b.setMessage(128,3,i,100);
				MidiEvent noteOff=new MidiEvent(b,i+2);
				track.add(noteOff);
			}}
			
			
			player.setSequence(seq);
			player.start();
	}
		catch(Exception e)
		{
			
		}
	}
}

class SoundTest
{
	public static void main(String[] args)
	{
		soundTest s=new soundTest();
		s.play();
	}
}