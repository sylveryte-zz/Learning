import javax.sound.midi.*;
class soundq
{	
	void play()
	{
		try
		{
			Sequencer player=MidiSystem.getSequencer();
			player.open();
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track=seq.createTrack();
			
			for(int i=60,k=0;i<70;i++)
			
				{
				ShortMessage a=new ShortMessage();
				a.setMessage(144,3,i,100);
				MidiEvent noteOn=new MidiEvent(a,i);
				track.add(noteOn);
			
				try
				{
					Thread.sleep(100);
				}catch (Exception e) {
				

				}
				System.out.println("on on "+ i);
				player.setSequence(seq);
			player.start();

				ShortMessage b=new ShortMessage();
				b.setMessage(128,3,i,100);
				MidiEvent noteOff=new MidiEvent(b,i+2);
				track.add(noteOff);

				try
				{
					Thread.sleep(500);
				}catch (Exception e) {
					
				}
			player.setSequence(seq);
			player.start();
			}
			
			
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
		soundq s=new soundq();
		s.play();
	}
}