class StarShip {
       
        String shipName = " UFO " ;
       
        public StarShip (){
 System . out . println ( " Building Starship : " + shipName );
        }
       
       protected StarShip ( String shipName ){
        this();
        this. shipName = shipName ;
        }
       
        void fireTorpedoAt ( StarShip target ){
        System . out . println ( " Fire Torpedo at : " + target . shipName );
        }
        }
       
        interface WarpDrive { void goToWarp ();}
       
        class FederationShip extends StarShip implements WarpDrive {
              public String captainsName = " Picard " ;
       
        boolean hullIntact ;
        protected int phaserBanks ;
        private float photonTorpedos ;
       
        public void goToWarp (){
        System . out . println ( " Warp Factor 8 " );
        }
        }
       
        class GalaxyClass extends FederationShip {
       
        public void goToWarp (){
        System . out . println ( " Make it so ! " );
        }
       
       public String toString (){
        return this. shipName ;
        }
       
        }
               class CostitutionClass extends FederationShip {
       
        static String captainsName = " Kirk " ;
       
        public CostitutionClass ( String shipName ){
        System . out . println ( " Building " + shipName );
       }
        }

        public class StarShipSimulation {
              
               private static StarShip [] ncc_1701 ;
               public static int a = 0;
               static int d = 3;
              
               public static void main ( String [] args ){
              
               ncc_1701 = new StarShip [4];
               ncc_1701 [ a ] = new CostitutionClass ( " Enterprise " );
               ncc_1701 [ d ] = new GalaxyClass ();
              
               System . out . println ( " Space race between : " + ncc_1701 [ a ] +
               " and " + ncc_1701 [ d ]);
              
               (( FederationShip ) ncc_1701 [ a ]). goToWarp ();
               (( FederationShip ) ncc_1701 [ d ]). goToWarp ();
               System . out . println ( (( FederationShip ) ncc_1701 [ a ]). captainsName
               + " is the better captain ! " );
               }
               }
              