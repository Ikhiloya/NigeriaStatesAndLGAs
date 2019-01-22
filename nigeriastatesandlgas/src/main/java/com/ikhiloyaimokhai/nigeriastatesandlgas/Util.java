package com.ikhiloyaimokhai.nigeriastatesandlgas;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import static com.ikhiloyaimokhai.nigeriastatesandlgas.Constant.*;

public class Util {

    private static final List<String> states = new ArrayList<>();
    private static final List<String> capitals = new ArrayList<>();

    private static final Set<String> abiaStateLgas = new TreeSet<>();
    private static final Set<String> adamawaStateLgas = new TreeSet<>();
    private static final Set<String> akwaIbomStateLgas = new TreeSet<>();

    private static final Set<String> anambraStateLgas = new TreeSet<>();
    private static final Set<String> bauchiStateLgas = new TreeSet<>();
    private static final Set<String> bayelsaStateLgas = new TreeSet<>();
    private static final Set<String> benueStateLgas = new TreeSet<>();
    private static final Set<String> bornoStateLgas = new TreeSet<>();
    private static final Set<String> crossRiverStateLgas = new TreeSet<>();
    private static final Set<String> deltaStateLgas = new TreeSet<>();
    private static final Set<String> ebonyiStateLgas = new TreeSet<>();
    private static final Set<String> edoStateLgas = new TreeSet<>();

    private static final Set<String> ekitiStateLgas = new TreeSet<>();
    private static final Set<String> enuguStateLgas = new TreeSet<>();
    private static final Set<String> fctLgas = new TreeSet<>();
    private static final Set<String> gombeStateLgas = new TreeSet<>();
    private static final Set<String> imoStateLgas = new TreeSet<>();
    private static final Set<String> jigawaStateLgas = new TreeSet<>();

    private static final Set<String> kadunaStateLgas = new TreeSet<>();
    private static final Set<String> kanoStateLgas = new TreeSet<>();
    private static final Set<String> katsinaStateLgas = new TreeSet<>();
    private static final Set<String> kebbiStateLgas = new TreeSet<>();
    private static final Set<String> kogiStateLgas = new TreeSet<>();
    private static final Set<String> kwaraStateLgas = new TreeSet<>();
    private static final Set<String> lagosStateLgas = new TreeSet<>();
    private static final Set<String> nasarawaStateLgas = new TreeSet<>();
    private static final Set<String> nigerStateLgas = new TreeSet<>();
    private static final Set<String> ogunStateLgas = new TreeSet<>();
    private static final Set<String> ondoStateLgas = new TreeSet<>();
    private static final Set<String> osunStateLgas = new TreeSet<>();
    private static final Set<String> oyoStateLgas = new TreeSet<>();
    private static final Set<String> plateauStateLgas = new TreeSet<>();
    private static final Set<String> riversStateLgas = new TreeSet<>();
    private static final Set<String> sokotoStateLgas = new TreeSet<>();
    private static final Set<String> tarabaStateLgas = new TreeSet<>();
    private static final Set<String> yobeStateLgas = new TreeSet<>();
    private static final Set<String> zamfaraStateLgas = new TreeSet<>();


    private static final Map<String, String> statesAndCapital = new LinkedHashMap<>();
    private static final Map<String, Set<String>> statesAndLgas = new LinkedHashMap<>();


    static List<String> states() {
        states.add(ABIA);
        states.add(ADAMAWA);
        states.add(AKWA_IBOM);
        states.add(ANAMBRA);
        states.add(BAUCHI);
        states.add(BAYELSA);
        states.add(BENUE);
        states.add(BORNO);
        states.add(CROSS_RIVER);
        states.add(DELTA);
        states.add(EBONYI);
        states.add(EDO);
        states.add(EKITI);
        states.add(ENUGU);
        states.add(GOMBE);
        states.add(IMO);
        states.add(JIGAWA);
        states.add(KADUNA);
        states.add(KANO);
        states.add(KATSINA);
        states.add(KEBBI);
        states.add(KOGI);
        states.add(KWARA);
        states.add(LAGOS);
        states.add(NASARAWA);
        states.add(NIGER);
        states.add(OGUN);
        states.add(ONDO);
        states.add(OSUN);
        states.add(OYO);
        states.add(PLATEAU);
        states.add(RIVERS);
        states.add(SOKOTO);
        states.add(TARABA);
        states.add(YOBE);
        states.add(ZAMFARA);
        states.add(FCT);
        return states;
    }

    static Map<String, String> statesAndCapital() {
        statesAndCapital.put(ABIA, UMUAHIA);
        statesAndCapital.put(ADAMAWA, YOLA);
        statesAndCapital.put(AKWA_IBOM, UYO);
        statesAndCapital.put(ANAMBRA, AWKA);
        statesAndCapital.put(BAUCHI, BAUCHI);
        statesAndCapital.put(BAYELSA, YENAGOA);
        statesAndCapital.put(BENUE, MAKURDI);
        statesAndCapital.put(BORNO, MAIDUGURI);
        statesAndCapital.put(CROSS_RIVER, CALABAR);
        statesAndCapital.put(DELTA, ASABA);
        statesAndCapital.put(EBONYI, ABAKALIKI);
        statesAndCapital.put(EDO, BENIN);
        statesAndCapital.put(EKITI, ADO_EKITI);
        statesAndCapital.put(ENUGU, ENUGU);
        statesAndCapital.put(GOMBE, GOMBE);
        statesAndCapital.put(IMO, OWERRI);
        statesAndCapital.put(JIGAWA, DUTSE);
        statesAndCapital.put(KADUNA, KADUNA);
        statesAndCapital.put(KANO, KANO);
        statesAndCapital.put(KATSINA, KATSINA);
        statesAndCapital.put(KEBBI, BIRNIN_KEBBI);
        statesAndCapital.put(KOGI, LOKOJA);
        statesAndCapital.put(KWARA, ILORIN);
        statesAndCapital.put(LAGOS, IKEJA);
        statesAndCapital.put(NASARAWA, LAFIA);
        statesAndCapital.put(NIGER, MINNA);
        statesAndCapital.put(OGUN, ABEOKUTA);
        statesAndCapital.put(ONDO, AKURE);
        statesAndCapital.put(OSUN, OSHOGBO);
        statesAndCapital.put(OYO, IBADAN);
        statesAndCapital.put(PLATEAU, JOS);
        statesAndCapital.put(RIVERS, PORT_HARCOURT);
        statesAndCapital.put(SOKOTO, SOKOTO);
        statesAndCapital.put(TARABA, JALINGO);
        statesAndCapital.put(YOBE, DAMATURU);
        statesAndCapital.put(ZAMFARA, GUSAU);
        statesAndCapital.put(FCT, ABUJA);

        return statesAndCapital;
    }


    public static String capital(String state) {
        return statesAndCapital.get(state);
    }


    public static List<String> capitals() {
        capitals.add(UMUAHIA);
        capitals.add(YOLA);
        capitals.add(UYO);
        capitals.add(AWKA);
        capitals.add(BAUCHI);
        capitals.add(YENAGOA);
        capitals.add(MAKURDI);
        capitals.add(MAIDUGURI);
        capitals.add(CALABAR);
        capitals.add(ASABA);
        capitals.add(ABAKALIKI);
        capitals.add(BENIN);
        capitals.add(ADO_EKITI);
        capitals.add(ENUGU);
        capitals.add(GOMBE);
        capitals.add(OWERRI);
        capitals.add(DUTSE);
        capitals.add(KADUNA);
        capitals.add(KANO);
        capitals.add(KATSINA);
        capitals.add(BIRNIN_KEBBI);
        capitals.add(LOKOJA);
        capitals.add(ILORIN);
        capitals.add(IKEJA);
        capitals.add(LAFIA);
        capitals.add(MINNA);
        capitals.add(ABEOKUTA);
        capitals.add(AKURE);
        capitals.add(OSHOGBO);
        capitals.add(IBADAN);
        capitals.add(JOS);
        capitals.add(PORT_HARCOURT);
        capitals.add(SOKOTO);
        capitals.add(JALINGO);
        capitals.add(DAMATURU);
        capitals.add(GUSAU);
        capitals.add(ABUJA);
        return capitals;
    }

    static Set<String> abiaStateLgas() {
        abiaStateLgas.add(ABA_NORTH);
        abiaStateLgas.add(ABA_SOUTH);
        abiaStateLgas.add(AROCHUKWU);
        abiaStateLgas.add(BENDE);
        abiaStateLgas.add(IKWUANO);
        abiaStateLgas.add(ISIALA_NGWA_NORTH);
        abiaStateLgas.add(ISIALA_NGWA_SOUTH);
        abiaStateLgas.add(ISUIKWUATO);
        abiaStateLgas.add(OBI_NGWA);
        abiaStateLgas.add(OHAFIA);
        abiaStateLgas.add(OSISIOMA_NGWA);
        abiaStateLgas.add(UGWUNAGBO);
        abiaStateLgas.add(UKWA_EAST);
        abiaStateLgas.add(UKWA_WEST);
        abiaStateLgas.add(UMUAHIA_NORTH);
        abiaStateLgas.add(UMUAHIA_SOUTH);
        abiaStateLgas.add(UMU_NNEOCHI);
//        Collections.sort(abiaStateLgas);
        return abiaStateLgas;
    }

    static Set<String> adamawaStateLga() {
        adamawaStateLgas.add(DEMSA);
        adamawaStateLgas.add(FUFORE);
        adamawaStateLgas.add(GANYE);
        adamawaStateLgas.add(GIREI);
        adamawaStateLgas.add(GOMBE);
        adamawaStateLgas.add(GUYUK);
        adamawaStateLgas.add(HONG);
        adamawaStateLgas.add(JADA);
        adamawaStateLgas.add(LAMURDE);
        adamawaStateLgas.add(MADAGALI);
        adamawaStateLgas.add(MAIHA);
        adamawaStateLgas.add(MAYO_BELWA);
        adamawaStateLgas.add(MICHIKA);
        adamawaStateLgas.add(MUBI_NORTH);
        adamawaStateLgas.add(MUBI_SOUTH);
        adamawaStateLgas.add(NUMAN);
        adamawaStateLgas.add(SHELLENG);
        adamawaStateLgas.add(SONG);
        adamawaStateLgas.add(YOLA_NORTH);
        adamawaStateLgas.add(YOLA_SOUTH);
//        Collections.sort(adamawaStateLgas);
        return adamawaStateLgas;
    }

    static Set<String> akwaIbomStateLga() {
        akwaIbomStateLgas.add(ABAK);
        akwaIbomStateLgas.add(EASTERN_OBOLO);
        akwaIbomStateLgas.add(EKET);
        akwaIbomStateLgas.add(ESIT_EKET);
        akwaIbomStateLgas.add(ESSIEN_UDIM);
        akwaIbomStateLgas.add(ETIM_EKPO);
        akwaIbomStateLgas.add(ETINAN);
        akwaIbomStateLgas.add(IBENO);
        akwaIbomStateLgas.add(IBESIKPO_ASUTAN);
        akwaIbomStateLgas.add(IBIONO_IBOM);
        akwaIbomStateLgas.add(IKA);
        akwaIbomStateLgas.add(IKONO);
        akwaIbomStateLgas.add(IKOT_ABASI);
        akwaIbomStateLgas.add(IKOT_EKPENE);
        akwaIbomStateLgas.add(INI);
        akwaIbomStateLgas.add(ITU);
        akwaIbomStateLgas.add(MBO);
        akwaIbomStateLgas.add(MKPAT_ENIN);
        akwaIbomStateLgas.add(NSIT_ATAI);
        akwaIbomStateLgas.add(NSIT_IBOM);
        akwaIbomStateLgas.add(NSIT_UBUIM);
        akwaIbomStateLgas.add(OBOT_AKARA);
        akwaIbomStateLgas.add(OKOBO);
        akwaIbomStateLgas.add(ONNA);
        akwaIbomStateLgas.add(ORON);
        akwaIbomStateLgas.add(ORUK_ANAM);
        akwaIbomStateLgas.add(UKANAFUN);
        akwaIbomStateLgas.add(UDUNG_UKO);
        akwaIbomStateLgas.add(URUAN);
        akwaIbomStateLgas.add(URUE_OFFIONG_ORUKO);
        return akwaIbomStateLgas;
    }


    static Set<String> anambraStateLgas() {
        anambraStateLgas.add(AGUATA);
        anambraStateLgas.add(AWKA_NORTH);
        anambraStateLgas.add(AWKA_SOUTH);
        anambraStateLgas.add(ANAMBRA_EAST);
        anambraStateLgas.add(ANAMBRA_WEST);
        anambraStateLgas.add(ANAOCHA);
        anambraStateLgas.add(AYAMELUM);
        anambraStateLgas.add(DUNUKOFIA);
        anambraStateLgas.add(EKWUSIGO);
        anambraStateLgas.add(IDEMILI_NORTH);
        anambraStateLgas.add(IDEMILI_SOUTH);
        anambraStateLgas.add(IHIALA);
        anambraStateLgas.add(NJIKOKA);
        anambraStateLgas.add(NNEWI_NORTH);
        anambraStateLgas.add(NNEWI_SOUTH);
        anambraStateLgas.add(OGBARU);
        anambraStateLgas.add(ONITSHA_NORTH);
        anambraStateLgas.add(ONITSHA_SOUTH);
        anambraStateLgas.add(ORUMBA_NORTH);
        anambraStateLgas.add(ORUMBA_SOUTH);
        anambraStateLgas.add(OYI);
        return anambraStateLgas;
    }


    static Set<String> bauchiStateLgas() {
        bauchiStateLgas.add(ALKALERI);
        bauchiStateLgas.add(BOGORO);
        bauchiStateLgas.add(DAMBAN);
        bauchiStateLgas.add(DARAZO);
        bauchiStateLgas.add(DASS);
        bauchiStateLgas.add(GAMAWA);
        bauchiStateLgas.add(GANJUWA);
        bauchiStateLgas.add(GIADE);
        bauchiStateLgas.add(ITAS_GADAU);
        bauchiStateLgas.add(JAMA_ARE);
        bauchiStateLgas.add(KATAGUM);
        bauchiStateLgas.add(KIRFI);
        bauchiStateLgas.add(MISAU);
        bauchiStateLgas.add(NINGI);
        bauchiStateLgas.add(SHIRA);
        bauchiStateLgas.add(TAFAWA_BALEWA);
        bauchiStateLgas.add(TORO);
        bauchiStateLgas.add(WARJI);
        bauchiStateLgas.add(ZAKI);
        return bauchiStateLgas;
    }

    static Set<String> bayelsaStateLgas() {
        bayelsaStateLgas.add(BRASS);
        bayelsaStateLgas.add(EKEREMOR);
        bayelsaStateLgas.add(KOLOKUMA_OKPOKUMA);
        bayelsaStateLgas.add(NEMBE);
        bayelsaStateLgas.add(OGBIA);
        bayelsaStateLgas.add(SAGBAMA);
        bayelsaStateLgas.add(SOUTHERN_IJAW);
        bayelsaStateLgas.add(YENAGOA);
        return bayelsaStateLgas;
    }


    static Set<String> benueStateLgas() {
        benueStateLgas.add(AGATU);
        benueStateLgas.add(APA);
        benueStateLgas.add(ADO);
        benueStateLgas.add(BURUKU);
        benueStateLgas.add(GBOKO);
        benueStateLgas.add(GUMA);
        benueStateLgas.add(GWER_EAST);
        benueStateLgas.add(GWER_WEST);
        benueStateLgas.add(KATSINA_ALA);
        benueStateLgas.add(KONSHISHA);
        benueStateLgas.add(KWANDE);
        benueStateLgas.add(LOGO);
        benueStateLgas.add(MAKURDI);
        benueStateLgas.add(OBI);
        benueStateLgas.add(OGBADIBO);
        benueStateLgas.add(OHIMINI);
        benueStateLgas.add(OJU);
        benueStateLgas.add(OKPOKWU);
        benueStateLgas.add(OTURKPO);
        benueStateLgas.add(TARKA);
        benueStateLgas.add(UKUM);
        benueStateLgas.add(USHONGO);
        benueStateLgas.add(VANDEIKA);
//        Collections.sort(benueStateLgas);
        return benueStateLgas;
    }


    static Set<String> bornuStateLgas() {
        bornoStateLgas.add(ABADAM);
        bornoStateLgas.add(ASKIRA_UBA);
        bornoStateLgas.add(BAMA);
        bornoStateLgas.add(BAYO);
        bornoStateLgas.add(BIU);
        bornoStateLgas.add(CHIBOK);
        bornoStateLgas.add(DAMBOA);
        bornoStateLgas.add(DIKWA);
        bornoStateLgas.add(GUBIO);
        bornoStateLgas.add(GUZAMALA);
        bornoStateLgas.add(GWOZA);
        bornoStateLgas.add(HAWUL);
        bornoStateLgas.add(JERE);
        bornoStateLgas.add(KAGA);
        bornoStateLgas.add(KALA_BALGE);
        bornoStateLgas.add(DEMKONDUGASA);
        bornoStateLgas.add(KUKAWA);
        bornoStateLgas.add(KWAYA_KUSAR);
        bornoStateLgas.add(MAFA);
        bornoStateLgas.add(MAGUMERI);
        bornoStateLgas.add(MAIDUGURI);
        bornoStateLgas.add(MARTE);
        bornoStateLgas.add(MOBBAR);
        bornoStateLgas.add(MONGUNO);
        bornoStateLgas.add(NGALA);
        bornoStateLgas.add(NGAZAI);
        bornoStateLgas.add(SHANI);
        return bornoStateLgas;
    }

    static Set<String> crossRiverStateLgas() {
        crossRiverStateLgas.add(ABI);
        crossRiverStateLgas.add(AKAMKPA);
        crossRiverStateLgas.add(AKPABUYO);
        crossRiverStateLgas.add(BAKASSI);
        crossRiverStateLgas.add(BEKWARRA);
        crossRiverStateLgas.add(BLASE);
        crossRiverStateLgas.add(BOKI);
        crossRiverStateLgas.add(CALABAR_MUNICIPAL);
        crossRiverStateLgas.add(CALABAR_SOUTH);
        crossRiverStateLgas.add(ETUNG);
        crossRiverStateLgas.add(IKOM);
        crossRiverStateLgas.add(OBANLIKU);
        crossRiverStateLgas.add(OBUBRA);
        crossRiverStateLgas.add(OBUDU);
        crossRiverStateLgas.add(ODUKPANI);
        crossRiverStateLgas.add(OGOJA);
        crossRiverStateLgas.add(YAKUUR);
        crossRiverStateLgas.add(YALA);
        return crossRiverStateLgas;
    }


    static Set<String> deltaStateLgas() {
        deltaStateLgas.add(ANIOCHA_NORTH);
        deltaStateLgas.add(ANIOCHA_SOUTH);
        deltaStateLgas.add(BOMADI);
        deltaStateLgas.add(BURUTU);
        deltaStateLgas.add(ETHIOPE_EAST);
        deltaStateLgas.add(ETHIOPE_WEST);
        deltaStateLgas.add(IKA_NORTH_EAST);
        deltaStateLgas.add(IKA_SOUTH);
        deltaStateLgas.add(ISOKO_NORTH);
        deltaStateLgas.add(ISOKO_SOUTH);
        deltaStateLgas.add(NDOKWA_EAST);
        deltaStateLgas.add(NDOKWA_WEST);
        deltaStateLgas.add(OKPE);
        deltaStateLgas.add(OSHIMILI_NORTH);
        deltaStateLgas.add(OSHIMILI_SOUTH);
        deltaStateLgas.add(PATANI);
        deltaStateLgas.add(SAPELE);
        deltaStateLgas.add(UDU);
        deltaStateLgas.add(UGHELLI_NORTH);
        deltaStateLgas.add(UGHELLI_SOUTH);
        deltaStateLgas.add(UKWUANI);
        deltaStateLgas.add(UVWIE);
        deltaStateLgas.add(WARRI_NORTH);
        deltaStateLgas.add(WARRI_SOUTH);
        deltaStateLgas.add(WARRI_SOUTH_WEST);
//        Collections.sort(deltaStateLgas);
        return deltaStateLgas;
    }


    static Set<String> ebonyiStateLgas() {
        ebonyiStateLgas.add(AFIKPO_NORTH);
        ebonyiStateLgas.add(AFIKPO_SOUTH);
        ebonyiStateLgas.add(EZZA_NORTH);
        ebonyiStateLgas.add(EZZA_SOUTH);
        ebonyiStateLgas.add(IKWO);
        ebonyiStateLgas.add(ISHIELU);
        ebonyiStateLgas.add(IVO);
        ebonyiStateLgas.add(IZZI);
        ebonyiStateLgas.add(OHAOZARA);
        ebonyiStateLgas.add(OHAUKWU);
        ebonyiStateLgas.add(ONICHA);
        return ebonyiStateLgas;
    }


    static Set<String> edoStateLgas() {
        edoStateLgas.add(AKOKO_EDO);
        edoStateLgas.add(EGOR);
        edoStateLgas.add(ESAN_CENTRAL);
        edoStateLgas.add(ESAN_NORTH_EAST);
        edoStateLgas.add(ESAN_SOUTH_EAST);
        edoStateLgas.add(ESAN_WEST);
        edoStateLgas.add(ETSAKO_CENTRAL);
        edoStateLgas.add(ETSAKO_EAST);
        edoStateLgas.add(ETSAKO_WEST);
        edoStateLgas.add(IGUEBEN);
        edoStateLgas.add(IKPOBA_OKHA);
        edoStateLgas.add(ORHIONMWON);
        edoStateLgas.add(OREDO);
        edoStateLgas.add(OVIA_NORTH_EAST);
        edoStateLgas.add(OVIA_SOUTH_WEST);
        edoStateLgas.add(OWAN_EAST);
        edoStateLgas.add(OWAN_WEST);
        edoStateLgas.add(UHUNMWONDE);
        return edoStateLgas;
    }

    static Set<String> ekitiStateLgas() {
        ekitiStateLgas.add(EFON);
        ekitiStateLgas.add(EKITI_EAST);
        ekitiStateLgas.add(EKITI_SOUTH_WEST);
        ekitiStateLgas.add(EKITI_WEST);
        ekitiStateLgas.add(EMURE);
        ekitiStateLgas.add(GBOYIN);
        ekitiStateLgas.add(IDO_OSI);
        ekitiStateLgas.add(IJERO);
        ekitiStateLgas.add(IKERE);
        ekitiStateLgas.add(IKOLI);
        ekitiStateLgas.add(ILEJEMEJE);
        ekitiStateLgas.add(IREPODUN_IFELODUN);
        ekitiStateLgas.add(ISE_ORUN);
        ekitiStateLgas.add(MOBA);
        ekitiStateLgas.add(OYE);
//        Collections.sort(ekitiStateLgas);
        return ekitiStateLgas;
    }


    static Set<String> enuguStateLgas() {
        enuguStateLgas.add(ANINRI);
        enuguStateLgas.add(AGWU);
        enuguStateLgas.add(ENUGU_EAST);
        enuguStateLgas.add(ENUGU_NORTH);
        enuguStateLgas.add(ENUGU_SOUTH);
        enuguStateLgas.add(EZEAGU);
        enuguStateLgas.add(IGBO_ETITI);
        enuguStateLgas.add(IGBO_EZE_NORTH);
        enuguStateLgas.add(IGBO_EZE_SOUTH);
        enuguStateLgas.add(ISI_UZO);
        enuguStateLgas.add(NKANU_EAST);
        enuguStateLgas.add(NKANU_WEST);
        enuguStateLgas.add(NSUKKA);
        enuguStateLgas.add(OJI_RIVER);
        enuguStateLgas.add(UDENU);
        enuguStateLgas.add(UDI);
        return enuguStateLgas;
    }

    static Set<String> fctLgas() {
        fctLgas.add(ABAJI);
        fctLgas.add(BWARI);
        fctLgas.add(GWAGWALADA);
        fctLgas.add(KUJE);
        fctLgas.add(KWALI);
        fctLgas.add(MUNICIPAL_AREA_COUNCIL);
//        Collections.sort(fctLgas);
        return fctLgas;
    }


    static Set<String> gombeStateLgas() {
        gombeStateLgas.add(AKKO);
        gombeStateLgas.add(BALANGA);
        gombeStateLgas.add(BILLIRI);
        gombeStateLgas.add(DUKKU);
        gombeStateLgas.add(FUNAKAYE);
        gombeStateLgas.add(KALTUNGO);
        gombeStateLgas.add(KWAMI);
        gombeStateLgas.add(NAFADA);
        gombeStateLgas.add(SHONGOM);
        gombeStateLgas.add(YAMALTU_DEBA);
        return gombeStateLgas;

    }

    static Set<String> imoStateLgas() {
        imoStateLgas.add(ABOH_MBAISE);
        imoStateLgas.add(AHIAZU_MBAISE);
        imoStateLgas.add(EHIME_MBANO);
        imoStateLgas.add(EZINIHITTE);
        imoStateLgas.add(IDEATO_NORTH);
        imoStateLgas.add(IDEATO_SOUTH);
        imoStateLgas.add(IHITTE_UBOMA);
        imoStateLgas.add(IKEDURU);
        imoStateLgas.add(ISIALA_MBANO);
        imoStateLgas.add(ISU);
        imoStateLgas.add(MBAITOLI);
        imoStateLgas.add(NGOR_OKPALA);
        imoStateLgas.add(NJABA);
        imoStateLgas.add(NKWERRE);
        imoStateLgas.add(NWANGELE);
        imoStateLgas.add(OBOWO);
        imoStateLgas.add(OGUTA);
        imoStateLgas.add(OHAJI_EGBEMA);
        imoStateLgas.add(OKIGWE);
        imoStateLgas.add(ORLU);
        imoStateLgas.add(ORSU);
        imoStateLgas.add(ORU_EAST);
        imoStateLgas.add(ORU_WEST);
        imoStateLgas.add(OWERRI_MUNICIPAL);
        imoStateLgas.add(OWERRI_NORTH);
        imoStateLgas.add(OWERRI_WEST);
        imoStateLgas.add(UNUIMO);
        return imoStateLgas;
    }


    static Set<String> jigawaStateLgas() {
        jigawaStateLgas.add(AUYO);
        jigawaStateLgas.add(BABURA);
        jigawaStateLgas.add(BIRINWA);
        jigawaStateLgas.add(BIRNIN_KUDU);
        jigawaStateLgas.add(BUJI);
        jigawaStateLgas.add(DUTSE);
        jigawaStateLgas.add(GAGARAWA);
        jigawaStateLgas.add(GARKI);
        jigawaStateLgas.add(GUMEL);
        jigawaStateLgas.add(GURI);
        jigawaStateLgas.add(GWAREM);
        jigawaStateLgas.add(GWIWA);
        jigawaStateLgas.add(HADEJIA);
        jigawaStateLgas.add(JAHUN);
        jigawaStateLgas.add(KAFIN_HAUSA);
        jigawaStateLgas.add(KAZAURE);
        jigawaStateLgas.add(KIRI_KASAMA);
        jigawaStateLgas.add(KIYAWA);
        jigawaStateLgas.add(KAUGAMA);
        jigawaStateLgas.add(MAIGATARI);
        jigawaStateLgas.add(MALAM_MADORI);
        jigawaStateLgas.add(MIGA);
        jigawaStateLgas.add(RINGIM);
        jigawaStateLgas.add(RONI);
        jigawaStateLgas.add(SULE_TANKARKAR);
        jigawaStateLgas.add(YANKWASHI);
        return jigawaStateLgas;
    }

    static Set<String> kadunaStateLgas() {
        kadunaStateLgas.add(BIRNIN_GWARI);
        kadunaStateLgas.add(CHIKUN);
        kadunaStateLgas.add(GIWA);
        kadunaStateLgas.add(IGABI);
        kadunaStateLgas.add(IKARA);
        kadunaStateLgas.add(JABA);
        kadunaStateLgas.add(JEMA);
        kadunaStateLgas.add(KACHIA);
        kadunaStateLgas.add(KADUNA_NORTH);
        kadunaStateLgas.add(KADUNA_SOUTH);
        kadunaStateLgas.add(KAGARKO);
        kadunaStateLgas.add(KAJURU);
        kadunaStateLgas.add(KAURA);
        kadunaStateLgas.add(KAURU);
        kadunaStateLgas.add(KUBAU);
        kadunaStateLgas.add(KUDAN);
        kadunaStateLgas.add(LERE);
        kadunaStateLgas.add(MAKARFI);
        kadunaStateLgas.add(SABON_GARI);
        kadunaStateLgas.add(SANGA);
        kadunaStateLgas.add(SOBA);
        kadunaStateLgas.add(ZAGON_KATAF);
        kadunaStateLgas.add(ZARIA);
        return kadunaStateLgas;
    }


    static Set<String> kanoStateLgas() {
        kanoStateLgas.add(AJINGI);
        kanoStateLgas.add(ALBASU);
        kanoStateLgas.add(BAGWAI);
        kanoStateLgas.add(BEBEJI);
        kanoStateLgas.add(BICHI);
        kanoStateLgas.add(BUNKERE);
        kanoStateLgas.add(DALA);
        kanoStateLgas.add(DAMBATTA);
        kanoStateLgas.add(DAWAKIN_KUDU);
        kanoStateLgas.add(DAWAKIN_TOFA);
        kanoStateLgas.add(DOGUWA);
        kanoStateLgas.add(FAGGE);
        kanoStateLgas.add(GABASAWA);
        kanoStateLgas.add(GARKO);
        kanoStateLgas.add(GARUN_MALLAM);
        kanoStateLgas.add(GAYA);
        kanoStateLgas.add(GEZAWA);
        kanoStateLgas.add(GWALE);
        kanoStateLgas.add(GWARZO);
        kanoStateLgas.add(KABO);
        kanoStateLgas.add(KANO_MUNICIPAL);
        kanoStateLgas.add(KARAYE);
        kanoStateLgas.add(KIBIYA);
        kanoStateLgas.add(KIRU);
        kanoStateLgas.add(KUMBOTSO);
        kanoStateLgas.add(KUNCHI);
        kanoStateLgas.add(KURA);
        kanoStateLgas.add(MADOBI);
        kanoStateLgas.add(MAKODA);
        kanoStateLgas.add(MINJIBIR);
        kanoStateLgas.add(RANO);
        kanoStateLgas.add(RIMIN_GADO);
        kanoStateLgas.add(ROGO);
        kanoStateLgas.add(SHANONO);
        kanoStateLgas.add(SUMAILA);
        kanoStateLgas.add(TAKAI);
        kanoStateLgas.add(TARAUNI);
        kanoStateLgas.add(TOFA);
        kanoStateLgas.add(TSANYAWA);
        kanoStateLgas.add(TUDUN_WADA);
        kanoStateLgas.add(UNGOGO);
        kanoStateLgas.add(WARAWA);
        kanoStateLgas.add(WUDIL);
        return kanoStateLgas;
    }


    static Set<String> katsinaStateLgas() {
        katsinaStateLgas.add(BAKORI);
        katsinaStateLgas.add(BATAGARAWA);
        katsinaStateLgas.add(BATSARI);
        katsinaStateLgas.add(BAURE);
        katsinaStateLgas.add(BINDAWA);
        katsinaStateLgas.add(CHARANCHI);
        katsinaStateLgas.add(DANDUME);
        katsinaStateLgas.add(DANJA);
        katsinaStateLgas.add(DAN_MUSA);
        katsinaStateLgas.add(DAURA);
        katsinaStateLgas.add(DUTSI);
        katsinaStateLgas.add(DUTSIN_MA);
        katsinaStateLgas.add(FASKARI);
        katsinaStateLgas.add(FUNTUA);
        katsinaStateLgas.add(INGAWA);
        katsinaStateLgas.add(JIBIA);
        katsinaStateLgas.add(KAFUR);
        katsinaStateLgas.add(KAITA);
        katsinaStateLgas.add(KANKARA);
        katsinaStateLgas.add(KANKIA);
        katsinaStateLgas.add(KURFI);
        katsinaStateLgas.add(KUSADA);
        katsinaStateLgas.add(MAI_ADUA);
        katsinaStateLgas.add(MALUMFASHI);
        katsinaStateLgas.add(MANI);
        katsinaStateLgas.add(MASHI);
        katsinaStateLgas.add(MATAZU);
        katsinaStateLgas.add(MUSAWA);
        katsinaStateLgas.add(RIMI);
        katsinaStateLgas.add(SABUWA);
        katsinaStateLgas.add(SAFANA);
        katsinaStateLgas.add(SANDAMU);
        katsinaStateLgas.add(ZANGO);
        return katsinaStateLgas;
    }


    static Set<String> kebbiStateLgas() {
        kebbiStateLgas.add(ALEIRO);
        kebbiStateLgas.add(AREWA_DANDI);
        kebbiStateLgas.add(ARGUNGU);
        kebbiStateLgas.add(AUGIE);
        kebbiStateLgas.add(BAGUDO);
        kebbiStateLgas.add(BIRNIN_KEBBI);
        kebbiStateLgas.add(BUNZA);
        kebbiStateLgas.add(DANDI);
        kebbiStateLgas.add(FAKAI);
        kebbiStateLgas.add(GWANDU);
        kebbiStateLgas.add(JEGA);
        kebbiStateLgas.add(KALGO);
        kebbiStateLgas.add(KOKO_BEESE);
        kebbiStateLgas.add(MAIYAMA);
        kebbiStateLgas.add(NGASKI);
        kebbiStateLgas.add(SAKABA);
        kebbiStateLgas.add(SHANGA);
        kebbiStateLgas.add(SURU);
        kebbiStateLgas.add(WASAGU_DANKO);
        kebbiStateLgas.add(YAURI);
        kebbiStateLgas.add(ZURU);
        return kebbiStateLgas;
    }


    static Set<String> kogiStateLgas() {
        kogiStateLgas.add(ADAVI);
        kogiStateLgas.add(AJAOKUTA);
        kogiStateLgas.add(ANKPA);
        kogiStateLgas.add(DEKINA);
        kogiStateLgas.add(IBAJI);
        kogiStateLgas.add(IDAH);
        kogiStateLgas.add(IGALAMELA_ODOLU);
        kogiStateLgas.add(IJUMU);
        kogiStateLgas.add(KABBA_BUNU);
        kogiStateLgas.add(LOKOJA);
        kogiStateLgas.add(MOPA_MURO);
        kogiStateLgas.add(OFU);
        kogiStateLgas.add(OGORI_MAGONGO);
        kogiStateLgas.add(OKEHI);
        kogiStateLgas.add(OKENE);
        kogiStateLgas.add(OLAMBORO);
        kogiStateLgas.add(OMALA);
        kogiStateLgas.add(YAGBA_EAST);
        kogiStateLgas.add(YAGBA_WEST);
//        Collections.sort(kogiStateLgas);
        return kogiStateLgas;
    }

    static Set<String> kwaraStateLgas() {
        kwaraStateLgas.add(ASA);
        kwaraStateLgas.add(BARUTEN);
        kwaraStateLgas.add(EDU);
        kwaraStateLgas.add(IFELODUN);
        kwaraStateLgas.add(ILORIN_EAST);
        kwaraStateLgas.add(ILORIN_SOUTH);
        kwaraStateLgas.add(ILORIN_WEST);
        kwaraStateLgas.add(IREPODUN);
        kwaraStateLgas.add(ISIN);
        kwaraStateLgas.add(KAIMA);
        kwaraStateLgas.add(MORO);
        kwaraStateLgas.add(OFFA);
        kwaraStateLgas.add(OKE_ERO);
        kwaraStateLgas.add(OYUN);
        kwaraStateLgas.add(PATEGI);
        return kwaraStateLgas;
    }

    static Set<String> lagosStateLgas() {
        lagosStateLgas.add(AGEGE);
        lagosStateLgas.add(AJEROMI_IFELODUN);
        lagosStateLgas.add(ALIMOSHO);
        lagosStateLgas.add(AMUWO_ODOFIN);
        lagosStateLgas.add(APAPA);
        lagosStateLgas.add(BADAGRY);
        lagosStateLgas.add(EPE);
        lagosStateLgas.add(ETIOSA);
        lagosStateLgas.add(IBEJU_LEKKI);
        lagosStateLgas.add(IFAKO_IJAIYE);
        lagosStateLgas.add(IKEJA);
        lagosStateLgas.add(IKORODU);
        lagosStateLgas.add(KOSOFE);
        lagosStateLgas.add(LAGOS_ISLAND);
        lagosStateLgas.add(LAGOS_MAINLAND);
        lagosStateLgas.add(MUSHIN);
        lagosStateLgas.add(OJO);
        lagosStateLgas.add(OSHODI_ISOLO);
        lagosStateLgas.add(SHOMOLU);
        lagosStateLgas.add(SURULERE);
//        Collections.sort(lagosStateLgas);
        return lagosStateLgas;
    }

    static Set<String> nasarawaStateLgas() {
        nasarawaStateLgas.add(AKWANGA);
        nasarawaStateLgas.add(AWE);
        nasarawaStateLgas.add(DOMA);
        nasarawaStateLgas.add(KARU);
        nasarawaStateLgas.add(KEANA);
        nasarawaStateLgas.add(KEFFI);
        nasarawaStateLgas.add(KOKONA);
        nasarawaStateLgas.add(LAFIA);
        nasarawaStateLgas.add(NASARAWA_EGBON);
        nasarawaStateLgas.add(TOTO);
        nasarawaStateLgas.add(WAMBA);
        return nasarawaStateLgas;
    }

    static Set<String> nigerStateLgas() {
        nigerStateLgas.add(AGAIE);
        nigerStateLgas.add(AGWARA);
        nigerStateLgas.add(BIDA);
        nigerStateLgas.add(BORGU);
        nigerStateLgas.add(BOSSO);
        nigerStateLgas.add(CHANCHAGA);
        nigerStateLgas.add(EDATI);
        nigerStateLgas.add(GBAKO);
        nigerStateLgas.add(GURARA);
        nigerStateLgas.add(KATCHA);
        nigerStateLgas.add(KONTAGORA);
        nigerStateLgas.add(LAPAI);
        nigerStateLgas.add(LAVUN);
        nigerStateLgas.add(MAGAMA);
        nigerStateLgas.add(MARIGA);
        nigerStateLgas.add(MASHEGU);
        nigerStateLgas.add(MOKWA);
        nigerStateLgas.add(MOYA);
        nigerStateLgas.add(PAIKORO);
        nigerStateLgas.add(RAFI);
        nigerStateLgas.add(RIKAU);
        nigerStateLgas.add(SHIRORO);
        nigerStateLgas.add(SULEJA);
        nigerStateLgas.add(TAFA);
        nigerStateLgas.add(WUSHISHI);
        return nigerStateLgas;
    }

    static Set<String> ogunStateLgas() {
        ogunStateLgas.add(ABEOKUTA_NORTH);
        ogunStateLgas.add(ABEOKUTA_SOUTH);
        ogunStateLgas.add(ADO_ODO_OTA);
        ogunStateLgas.add(EGBADO_NORTH);
        ogunStateLgas.add(EGBADO_SOUTH);
        ogunStateLgas.add(EWEKORO);
        ogunStateLgas.add(IFO);
        ogunStateLgas.add(IJEBU_EAST);
        ogunStateLgas.add(IJEBU_NORTH);
        ogunStateLgas.add(IJEBU_NORTH_EAST);
        ogunStateLgas.add(IJEBU_ODE);
        ogunStateLgas.add(IKENNE);
        ogunStateLgas.add(IMEKO_AFON);
        ogunStateLgas.add(IPOKIA);
        ogunStateLgas.add(OBAFEMI_OWODE);
        ogunStateLgas.add(ODEDA);
        ogunStateLgas.add(ODOGBOLU);
        ogunStateLgas.add(OGUN_WATERSIDE);
        ogunStateLgas.add(REMO_NORTH);
        ogunStateLgas.add(SHAGAMU);
        return ogunStateLgas;
    }

    static Set<String> ondoStateLgas() {
        ondoStateLgas.add(AKOKO_NORTH_EAST);
        ondoStateLgas.add(AKOKO_NORTH_WEST);
        ondoStateLgas.add(AKOKO_SOUTH_WEST);
        ondoStateLgas.add(AKOKO_SOUTH_EAST);
        ondoStateLgas.add(AKURE_NORTH);
        ondoStateLgas.add(AKURE_SOUTH);
        ondoStateLgas.add(ESE_ODO);
        ondoStateLgas.add(IDANRE);
        ondoStateLgas.add(IFEDORE);
        ondoStateLgas.add(ILAJE);
        ondoStateLgas.add(ILE_OLUJI);
        ondoStateLgas.add(IRELE);
        ondoStateLgas.add(ODIGBO);
        ondoStateLgas.add(OKITIPUPA);
        ondoStateLgas.add(ONDO_EAST);
        ondoStateLgas.add(ONDO_WEST);
        ondoStateLgas.add(OSE);
        ondoStateLgas.add(OWO);
        return ondoStateLgas;
    }

    static Set<String> osunStateLgas() {
        osunStateLgas.add(ATAKUNMOSA_EAST);
        osunStateLgas.add(ATAKUNMOSA_WEST);
        osunStateLgas.add(AIYEDAADE);
        osunStateLgas.add(AIYEDIRE);
        osunStateLgas.add(BOLUWADURO);
        osunStateLgas.add(BORIPE);
        osunStateLgas.add(EDE_NORTH);
        osunStateLgas.add(EDE_SOUTH);
        osunStateLgas.add(IFE_CENTRAL);
        osunStateLgas.add(IFE_EAST);
        osunStateLgas.add(IFE_NORTH);
        osunStateLgas.add(IFE_SOUTH);
        osunStateLgas.add(EGBEDORE);
        osunStateLgas.add(EJIGBO);
        osunStateLgas.add(IFEDAYO);
        osunStateLgas.add(ILA);
        osunStateLgas.add(ILESA_EAST);
        osunStateLgas.add(ILESA_WEST);
        osunStateLgas.add(IREWOLE);
        osunStateLgas.add(ISOKAN);
        osunStateLgas.add(IWO);
        osunStateLgas.add(OBOKUN);
        osunStateLgas.add(ODO_OTIN);
        osunStateLgas.add(OLA_OLUWA);
        osunStateLgas.add(OLORUNDA);
        osunStateLgas.add(ORIADE);
        osunStateLgas.add(OROLU);
        osunStateLgas.add(OSOGBO);
        return osunStateLgas;
    }

    static Set<String> oyoStateLgas() {
        oyoStateLgas.add(AFIJIO);
        oyoStateLgas.add(AKINYELE);
        oyoStateLgas.add(ATIBA);
        oyoStateLgas.add(ATISBO);
        oyoStateLgas.add(EGBEDA);
        oyoStateLgas.add(IBADAN_NORTH);
        oyoStateLgas.add(IBADAN_NORTH_EAST);
        oyoStateLgas.add(IBADAN_NORTH_WEST);
        oyoStateLgas.add(IBADAN_SOUTH_EAST);
        oyoStateLgas.add(IBADAN_SOUTH_WEST);
        oyoStateLgas.add(IBARAPA_CENTRAL);
        oyoStateLgas.add(IBARAPA_EAST);
        oyoStateLgas.add(IBARAPA_NORTH);
        oyoStateLgas.add(IDO);
        oyoStateLgas.add(IREPO);
        oyoStateLgas.add(ISEYIN);
        oyoStateLgas.add(ITESIWAJU);
        oyoStateLgas.add(IWAJOWA);
        oyoStateLgas.add(KAJOLA);
        oyoStateLgas.add(LAGELU);
        oyoStateLgas.add(OGBOMOSHO_NORTH);
        oyoStateLgas.add(OGBOMOSHO_SOUTH);
        oyoStateLgas.add(OGO_OLUWA);
        oyoStateLgas.add(OLORUNSOGO);
        oyoStateLgas.add(OLUYOLE);
        oyoStateLgas.add(ONA_ARA);
        oyoStateLgas.add(ORELOPE);
        oyoStateLgas.add(ORI_IRE);
        oyoStateLgas.add(OYO_EAST);
        oyoStateLgas.add(SAKI_EAST);
        oyoStateLgas.add(SAKI_WEST);
        return oyoStateLgas;
    }

    static Set<String> plateauStateLgas() {
        plateauStateLgas.add(BOKKOS);
        plateauStateLgas.add(BARKIN_LADI);
        plateauStateLgas.add(BASSA);
        plateauStateLgas.add(JOS_EAST);
        plateauStateLgas.add(JOS_NORTH);
        plateauStateLgas.add(JOS_SOUTH);
        plateauStateLgas.add(KANAM);
        plateauStateLgas.add(KANKE);
        plateauStateLgas.add(LANGTANG_NORTH);
        plateauStateLgas.add(LANGTANG_SOUTH);
        plateauStateLgas.add(MANGU);
        plateauStateLgas.add(MIKANG);
        plateauStateLgas.add(PANSHAKIN);
        plateauStateLgas.add(QUAAN_PAN);
        plateauStateLgas.add(RIYOM);
        plateauStateLgas.add(SHENDAM);
        plateauStateLgas.add(WASE);
//        Collections.sort(plateauStateLgas);
        return plateauStateLgas;
    }


    static Set<String> riversStateLgas() {
        riversStateLgas.add(ABUA_ODUAL);
        riversStateLgas.add(AHOADA_EAST);
        riversStateLgas.add(AHOADA_WEST);
        riversStateLgas.add(AKUKU_TORU);
        riversStateLgas.add(ANDONI);
        riversStateLgas.add(ASARI_TORU);
        riversStateLgas.add(BONNY);
        riversStateLgas.add(DEGEMA);
        riversStateLgas.add(ELEME);
        riversStateLgas.add(EMUOHA);
        riversStateLgas.add(ETCHE);
        riversStateLgas.add(GOKANA);
        riversStateLgas.add(IKWERRE);
        riversStateLgas.add(KHANA);
        riversStateLgas.add(OBIO_AKPOR);
        riversStateLgas.add(OGBA_EGBEMA_NDONI);
        riversStateLgas.add(OGU_BOLO);
        riversStateLgas.add(OKRIKA);
        riversStateLgas.add(OMUMA);
        riversStateLgas.add(OPOBO_NKORO);
        riversStateLgas.add(OYIGBO);
        riversStateLgas.add(PORT_HARCOURT);
        riversStateLgas.add(TAI);
        return riversStateLgas;
    }


    static Set<String> sokotoStateLgas() {
        sokotoStateLgas.add(BINJI);
        sokotoStateLgas.add(BODINGA);
        sokotoStateLgas.add(DANGE_SHUNI);
        sokotoStateLgas.add(GADA);
        sokotoStateLgas.add(GORONYO);
        sokotoStateLgas.add(GUDU);
        sokotoStateLgas.add(GWADABAWA);
        sokotoStateLgas.add(ILLELA);
        sokotoStateLgas.add(ISA);
        sokotoStateLgas.add(KEBBE);
        sokotoStateLgas.add(KWARE);
        sokotoStateLgas.add(RABAH);
        sokotoStateLgas.add(SABON_BIRNI);
        sokotoStateLgas.add(SHAGARI);
        sokotoStateLgas.add(SILAME);
        sokotoStateLgas.add(SOKOTO_NORTH);
        sokotoStateLgas.add(SOKOTO_SOUTH);
        sokotoStateLgas.add(TAMBUWAL);
        sokotoStateLgas.add(TANGAZA);
        sokotoStateLgas.add(TURETA);
        sokotoStateLgas.add(WAMAKO);
        sokotoStateLgas.add(WURNO);
        sokotoStateLgas.add(YABO);
        return sokotoStateLgas;
    }

    static Set<String> tarabaStateLgas() {
        tarabaStateLgas.add(ARDO_KOLA);
        tarabaStateLgas.add(BALI);
        tarabaStateLgas.add(DONGA);
        tarabaStateLgas.add(GASHAKA);
        tarabaStateLgas.add(GASSOL);
        tarabaStateLgas.add(IBI);
        tarabaStateLgas.add(JALINGO);
        tarabaStateLgas.add(KARIM_LAMIDO);
        tarabaStateLgas.add(KUMI);
        tarabaStateLgas.add(LAU);
        tarabaStateLgas.add(SARDAUNA);
        tarabaStateLgas.add(TAKUM);
        tarabaStateLgas.add(USSA);
        tarabaStateLgas.add(WUKARI);
        tarabaStateLgas.add(YORRO);
        tarabaStateLgas.add(ZING);
        return tarabaStateLgas;
    }


    static Set<String> yobeStateLgas() {
        yobeStateLgas.add(BADE);
        yobeStateLgas.add(BURSARI);
        yobeStateLgas.add(DAMATURU);
        yobeStateLgas.add(FIKA);
        yobeStateLgas.add(FUNE);
        yobeStateLgas.add(GEIDAM);
        yobeStateLgas.add(GUJBA);
        yobeStateLgas.add(GULANI);
        yobeStateLgas.add(JAKUSKO);
        yobeStateLgas.add(KARASUWA);
        yobeStateLgas.add(MACHINA);
        yobeStateLgas.add(NANGERE);
        yobeStateLgas.add(NGURU);
        yobeStateLgas.add(POTISKUM);
        yobeStateLgas.add(TARMUWA);
        yobeStateLgas.add(YUNUSARI);
        yobeStateLgas.add(YUSUFARI);
        return yobeStateLgas;
    }


    static Set<String> zamfaraStateLgas() {
        zamfaraStateLgas.add(ANKA);
        zamfaraStateLgas.add(BAKURA);
        zamfaraStateLgas.add(BIRNIN_MAGAJI);
        zamfaraStateLgas.add(BUKKUYUM);
        zamfaraStateLgas.add(BUNGUDU);
        zamfaraStateLgas.add(GUMMI);
        zamfaraStateLgas.add(GUSAU);
        zamfaraStateLgas.add(KAURA_NAMODA);
        zamfaraStateLgas.add(MARADUN);
        zamfaraStateLgas.add(MARU);
        zamfaraStateLgas.add(SHINKAFA);
        zamfaraStateLgas.add(TALATA_MAFARA);
        zamfaraStateLgas.add(CHAFE);
        zamfaraStateLgas.add(ZURMI);
        return zamfaraStateLgas;
    }


    public static Map<String, Set<String>> lgas() {
        statesAndLgas.put(ABIA, abiaStateLgas());
        statesAndLgas.put(ADAMAWA, adamawaStateLga());
        statesAndLgas.put(AKWA_IBOM, akwaIbomStateLga());
        statesAndLgas.put(ANAMBRA, anambraStateLgas());
        statesAndLgas.put(BAUCHI, bauchiStateLgas());
        statesAndLgas.put(BAYELSA, bayelsaStateLgas());
        statesAndLgas.put(BENUE, benueStateLgas());
        statesAndLgas.put(BORNO, bornuStateLgas());
        statesAndLgas.put(CROSS_RIVER, crossRiverStateLgas());
        statesAndLgas.put(DELTA, deltaStateLgas());
        statesAndLgas.put(EBONYI, ebonyiStateLgas());
        statesAndLgas.put(EDO, edoStateLgas());
        statesAndLgas.put(EKITI, ekitiStateLgas());
        statesAndLgas.put(ENUGU, enuguStateLgas());
        statesAndLgas.put(GOMBE, gombeStateLgas());
        statesAndLgas.put(IMO, imoStateLgas());
        statesAndLgas.put(JIGAWA, jigawaStateLgas());
        statesAndLgas.put(KADUNA, kadunaStateLgas());
        statesAndLgas.put(KANO, kanoStateLgas());
        statesAndLgas.put(KATSINA, katsinaStateLgas());
        statesAndLgas.put(KEBBI, kebbiStateLgas());
        statesAndLgas.put(KOGI, kogiStateLgas());
        statesAndLgas.put(KWARA, kwaraStateLgas());
        statesAndLgas.put(LAGOS, lagosStateLgas());
        statesAndLgas.put(NASARAWA, nasarawaStateLgas());
        statesAndLgas.put(NIGER, nigerStateLgas());
        statesAndLgas.put(OGUN, ogunStateLgas());
        statesAndLgas.put(ONDO, ondoStateLgas());
        statesAndLgas.put(OSUN, osunStateLgas());
        statesAndLgas.put(OYO, oyoStateLgas());
        statesAndLgas.put(PLATEAU, plateauStateLgas());
        statesAndLgas.put(RIVERS, riversStateLgas());
        statesAndLgas.put(SOKOTO, sokotoStateLgas());
        statesAndLgas.put(TARABA, tarabaStateLgas());
        statesAndLgas.put(YOBE, yobeStateLgas());
        statesAndLgas.put(ZAMFARA, zamfaraStateLgas());
        statesAndLgas.put(FCT, fctLgas());
        return statesAndLgas;
    }


    public static Set<String> lgasByState(String state) {
        return lgas().get(state);
    }


}
