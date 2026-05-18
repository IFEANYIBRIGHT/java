import java.util.ArrayList;
import java.util.List;

public class SeekersRepositoriesImpl implements SeekersRepositories {
     private List<Seeker> seekerList = new ArrayList<>();
     private int idCounter = 1;

     @Override
    public Seeker save(Seeker seeker){
         if(seeker.getId() == 0){
             seeker.setId(idCounter++);
             seekerList.add(seeker);
             return seeker;
         }
        for(int count = 0;count < seekerList.size();count++){
            if(seekerList.get(count).getId() == seeker.getId()){
                seekerList.set(count, seeker);
                return seeker;
            }
        }
     seekerList.add(seeker);
        return seeker;

     }

     @Override
    public Seeker findById(int id){
        for(Seeker seeker: seekerList){
            if(seeker.getId() == id){
                return seeker;}
            }
        return null;
     }

    @Override
    public List<Seeker> findAll() {
        return new ArrayList<>(seekerList);
    }

    @Override
    public void deleteById(int id) {
    for(Seeker seeker : seekerList){
        if(seeker.getId() == id){
        seekerList.remove(seeker);
        }
     }
     }

    @Override
    public void deleteAll() {
    seekerList.clear();
    }

    @Override
    public int count() {
        return seekerList.size();}


}
