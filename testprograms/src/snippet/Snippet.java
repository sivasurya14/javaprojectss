package snippet;

public class Snippet {
	@Query(value="select qualification ,totalmarks ,percentage,outofmarks from userqualification where totalmarks >?1 and totalmarks<?2 ",nativeQuery = true)
		 public List<UserQualificationEntity> getMarks (@PathVariable ("frommark") Integer frommark,@PathVariable ("tomark") Integer tomark);
		
}

