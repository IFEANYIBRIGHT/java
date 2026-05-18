import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

   public class PreferenceRepositoryImplTest {

        private Preference newPreference;
        private PreferenceRepositoryImpl preferenceRepository;

        @BeforeEach
        void setUp() {
            preferenceRepository = new PreferenceRepositoryImpl();

            newPreference = new Preference();
            newPreference.setMiniAge(20);
        }

        @Test
        void testSavePreference() {
            preferenceRepository.save(newPreference);

            assertNotNull(newPreference.getId());
        }

        @Test
        void testFindPreferenceById() {
            preferenceRepository.save(newPreference);
            Preference foundPreference = preferenceRepository.findById(newPreference.getId());

            assertNotNull(foundPreference);
            assertEquals(20, foundPreference.getMiniAge());
        }
        @Test
        void testFindById_withInvalidId_returnsNull() {
            Preference result = preferenceRepository.findById(999L);
            assertNull(result);
        }
        @Test
        public void findAllReturnsThreePreferencesTest() {

            Preference preference1 = new Preference();
            Preference preference2 = new Preference();
            Preference preference3 = new Preference();
            preferenceRepository.save(preference1);
            preferenceRepository.save(preference2);
            preferenceRepository.save(preference3);

            assertEquals(3, preferenceRepository.findAll().size());
        }
        @Test
        void testDeleteById_thenFindByIdReturnsNull() {
            preferenceRepository.save(newPreference);

            Long id = newPreference.getId();

            preferenceRepository.deleteById(id);

            Preference result = preferenceRepository.findById(id);

            assertNull(result);
        }

        @Test
        void testCount_beforeAndAfterDelete_dropsFromThreeToTwo() {
            Preference pref1 = new Preference();
            Preference pref2 = new Preference();
            Preference pref3 = new Preference();

            preferenceRepository.save(pref1);
            preferenceRepository.save(pref2);
            preferenceRepository.save(pref3);

            assertEquals(3, preferenceRepository.count());

            preferenceRepository.deleteById(pref1.getId());

            assertEquals(2, preferenceRepository.count());
        }

        @Test
        void testUpdatePreference_thenFetchedDistanceIsUpdated() {
            newPreference.setMaxiDistance(50);

            preferenceRepository.save(newPreference);

            newPreference.setMaxiDistance(99);

            preferenceRepository.save(newPreference);

            Preference updatedPreference =
                    preferenceRepository.findById(newPreference.getId());

            assertNotNull(updatedPreference);
            assertEquals(99, updatedPreference.getMaxiDistance());
        }

    }

