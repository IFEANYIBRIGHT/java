import java.util.List;

  public interface SeekersRepositories {
   Seeker save(Seeker seeker);
   Seeker findById(int id);
     List<Seeker> findAll();
    void deleteById(int id);
    void deleteAll();
    int count();

}
