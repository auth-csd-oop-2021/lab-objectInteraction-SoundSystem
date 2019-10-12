/**
 * Αυτή η κλάση αναπαραριστά ένα ηχοσύστημα. Κάθε ηχοσύστημα αποτελείται από 2 ήχεια (κλάση Speaker).
 * This class represents a sound system. Each sound system has 2 speakers (Speaker class).
 */
public class SoundSystem {


    // Κατασκευάστε δύο κατασκευαστές (υπερφόρτωση). Ο πρώτος κατασκευαστής δεν θα δέχεται κανένα όρισμα και το
    // ηχοσύστημα θα αποτελείται από 2 ήχεια των 40 watts και 60 spl. Ο δεύτερος κατασκευαστής θα δέχεται δύο ηχεία ως
    // παραμέτρους.
    // Create two constructors (overload). The first constructor should not have any parameters and the sound system will
    // have two speakers of 40 watts and 60 spl. The second constructor should have two parameters which should be
    // the two speakers.

    /**
     * Μέθοδος που αλλάζει το πρώτο ηχείο.
     * This method should change the first speaker.
     */
    public void setSpeaker1(Speaker speaker) {

    }

    /**
     * Μέθοδος που αλλάζει το δεύτερο ηχείο.
     * This method should change the second speaker.
     */
    public void setSpeaker2(Speaker speaker) {

    }

    /**
     * Μέθοδος που επιστρέφει το πρώτο ηχείο.
     * This method should return the first speaker.
     */
    public Speaker getSpeaker1() {

    }

    /**
     * Μέθοδος που επιστρέφει το δεύτερο ηχείο.
     * This method should return the second speaker.
     */
    public Speaker getSpeaker2() {

    }

    /**
     * Αυτή η μέθοδος επιστρέφει το άθροισμα της ισχύς του ηχοσυστήματος.
     * This method should return the sound system's total power.
     */
    public int getTotalWatts() {

    }

    /**
     * Ένα ηχείο θεωρήτο επικίνδυνο για το ανθρώπινο αυτί αν ξεπερνά τα 130 spl. Αυτή η μέθοδος θα πρέπει να επιστρέφει
     * αν το ηχοσύστημα είναι επικίνδυνο ή όχι.
     * A speaker is considered dangerous if it exceeds the threshold of 130 spl. This method should return if the
     * sound system is dangerous or not.
     */
    public boolean isDangerous() {

    }

    /**
     * Αυτή η μέθοδος θα πρέπει να επιστρέφει την μέση βαθμολογία του ηχοσυστήματος.
     * This method should return the average rating of the sound system.
     */
    public double getAverageRating() {

    }

}
