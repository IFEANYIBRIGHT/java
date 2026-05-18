import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 public class SeekersRepositoriesImplTest {
     SeekersRepositoriesImpl seekersRepo;

     @BeforeEach
     void setUp() {
         seekersRepo = new SeekersRepositoriesImpl();
         Seeker seeker = new Seeker();
     }

     @Test
     void testRepoExists() {
         assertNotNull(seekersRepo);
     }

     @Test
     void testRepoSaves() {
         assertNotNull(seekersRepo);
         Seeker seek = new Seeker();
         seekersRepo.save(seek);
         assertEquals(1, seekersRepo.count());

     }
     @Test
     void testFindById(){
         assertNotNull(seekersRepo);
         Seeker seek = new Seeker();
         seekersRepo.save(seek);
         int id = 123;
         
         assertEquals(1, seekersRepo.count());

     }

 }