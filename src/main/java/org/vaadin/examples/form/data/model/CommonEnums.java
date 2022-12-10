package org.vaadin.examples.form.data.model;

import java.util.*;

public class CommonEnums {
    public static Map<String, List<String>> provinceAndDistrictMapping;
    public static Map<String,List<String>> municipalityAndDistrictMapping;

    public enum Province {
        Gandaki,
        Lumbini,
        Madesh,
        Karnali,
        Sudurpachim,
        Bagmati,
        Province_No_1
    }

    public CommonEnums(){
        provinceAndDistrictMapping = new HashMap<>();
        municipalityAndDistrictMapping = new HashMap<>();

        provinceAndDistrictMapping.put("Bagmati", Arrays.asList("Rasuwa","Dolakha","Ramechhap","Sindhupalchok","Kavrepalanchok","Dhading","Lalitpur","Kathmandu",
                "Makawanpur","Chitwan","Sindhuli","Bhaktapur","Nuwakot"));
        provinceAndDistrictMapping.put("Gandaki",Arrays.asList("Nawalparasi East","Lamjung","Gorkha","Myagdi","Syangja","Tanahun","Kaski","Baglung","Manang",
                "Mustang","Parbat"));
        provinceAndDistrictMapping.put("Lumbini",Arrays.asList("Pyuthan","Banke","Rupandehi","Rolpa","Dang","Eastern Rukum","Arghakhanchi","Palpa","Kapilvastu",
                "Bardiya","Nawalparasi West","Gulmi"));
        provinceAndDistrictMapping.put("Madhesh",Arrays.asList("Rautahat","Parsa","Dhanusha","Mahottari","Saptari","Bara","Siraha","Sarlahi"));
        provinceAndDistrictMapping.put("Karnali",Arrays.asList("Dailekh","Dolpa","Salyan","Mugu","Jajarkot","Western Rukum","Jumla","Humla","Kalikot","Surkhet"));
        provinceAndDistrictMapping.put("Sudurpashchim",Arrays.asList("Kailali","Kanchanpur","Bajura","Bajhang","Baitadi","Doti","Dadeldhura","Darchula","Achham"));
        provinceAndDistrictMapping.put("Province No 1",Arrays.asList("Khotang","Okhaldhunga","Jhapa","Ilam","Sunsari","Sankhuwasabha","Bhojpur","Solukhumbu",
                "Morang","Panchthar","Dhankuta","Udayapur","Taplejung","Tehrathum"));
        //Bagmati
        municipalityAndDistrictMapping.put("Rasuwa",Arrays.asList("Uttargaya Rural Municipality","Aamachhodingmo Rural Municipality","Gosaikunda Rural Municipality",
                "Kalika Rural Municipality","Naukunda Rural Municipality"));
        municipalityAndDistrictMapping.put("Dolakha",Arrays.asList("Bigu Rural Municipality","Melung Rural Municipality","Tamakoshi Rural Municipality","Gaurishankar Rural Municipality",
                "Shailung Rural Municipality","Bhimeshwor Municipality","Baiteshwor Rural Municipality","Jiri  Municipality","Kalinchok Rural Municipality"));
        municipalityAndDistrictMapping.put("Ramechhap",Arrays.asList("Ramechhap Municipality","Manthali Municipality","Likhu Tamakoshi Rural Municipality",
                "Doramba Rural Municipality","Umakunda Rural Municipality","Gokulganga Rural Municipality","Khandadevi Rural Municipality","Sunapati Rural Municipality"));
        municipalityAndDistrictMapping.put("Sindhupalchok",Arrays.asList("Tripurasundari Rural Municipality","Sunkoshi Rural Municipality","Jugal Rural Municipality",
                "Lisankhu Pakhar Rural Municipality","Balephi Rural Municipality","Indrawati Rural Municipality","Bhotekoshi Rural Municipality","Melamchi Municipality",
                "Helambu Rural Municipality","Panchpokhari Thangpal Rural Municipality","Barhabise Municipality","Chautara Sangachokgadhi Municipality"));
        municipalityAndDistrictMapping.put("Kavrepalanchok",Arrays.asList("Khanikhola Rural Municipality","Mahabharat Rural Municipality","Temal Rural Municipality","Bhumlu Rural Municipality",
                "Dhulikhel Municipality","Roshi Rural Municipality","Banepa Municipality","Bethanchok Rural Municipality","Namobuddha Municipality","Mandandeupur Municipality",
                "Panauti Municipality","Panchkhal Municipality","Chaurideurali Rural Municipality"));
        municipalityAndDistrictMapping.put("Dhading",Arrays.asList("Siddhalek Rural Municipality","Khaniyabas Rural Municipality","Netrawati Dabjong Rural Municipality",
                "Jwalamukhi Rural Municipality","Gajuri Rural Municipality","Tripurasundari Rural Municipality","Thakre Rural Municipality","Dhunibeshi Municipality",
                "Neelakantha Municipality","Benighat Rorang Rural Municipality","Galchhi Rural Municipality","Rubi Valley Rural Municipality","Gangajamuna Rural Municipality"));
        municipalityAndDistrictMapping.put("Lalitpur",Arrays.asList("Konjyosom Rural Municipality","Lalitpur Metropolitan City","Bagmati Rural Municipality",
                "Mahalaxmi Municipality","Mahankal Rural Municipality","Godawari Municipality"));
        municipalityAndDistrictMapping.put("Kathmandu",Arrays.asList("Nagarjun Municipality","Shankharapur Municipality","Budhanilkantha Municipality","Dakshinkali Municipality",
                "Chandragiri Municipality","Tokha Municipality","Tarkeshwor Municipality","Kirtipur Municipality","Kageshwori Manohora Municipality","Gokarneshwor Municipality",
                "Kathmandu Metropolitan City"));
        municipalityAndDistrictMapping.put("Makawanpur",Arrays.asList("Makawanpurgadhi Rural Municipality","Bagmati Rural Municipality","Bhimphedi Rural Municipality",
                "Raksirang Rural Municipality","Hetauda Sub Metropolitan City","Kailash Rural Municipality","Thaha Municipality","Indrasarowar Rural Municipality",
                "Manahari Rural Municipality","Bakaiya Rural Municipality"));
        municipalityAndDistrictMapping.put("Chitwan",Arrays.asList("Khairahani Municipality","Madi Municipality","Ichchhakamana Rural Municipality","Ratnanagar Municipality",
                "Rapti Municipality","Bharatpur Metropolitan City","Kalika Municipality"));
        municipalityAndDistrictMapping.put("Sindhuli",Arrays.asList("Sunkoshi Rural Municipality","Dudhauli Municipality","Phikkal Rural Municipality",
                "Kamalamai Municipality","Golanjor Rural Municipality","Ghyanglekh Rural Municipality","Tinpatan Rural Municipality","Marin Rural Municipality",
                "Hariharpurgadhi Rural Municipality"));
        municipalityAndDistrictMapping.put("Bhaktapur",Arrays.asList("Bhaktapur Municipality","Changunarayan Municipality","Madhyapur Thimi Municipality","Suryabinayak Municipality"));
        municipalityAndDistrictMapping.put("Nuwakot",Arrays.asList("Panchakanya Rural Municipality","Suryagadhi Rural Municipality","Kispang Rural Municipality","Tarkeshwor Rural Municipality",
                "Likhu Rural Municipality","Dupcheshwor Rural Municipality","Tadi Rural Municipality","Myagang Rural Municipality","Belkotgadhi Municipality",
                "Kakani Rural Municipality","Shivapuri Rural Municipality","Bidur Municipality"));

        //Gandaki
        municipalityAndDistrictMapping.put("Nawalparasi East",Arrays.asList("Baudikali Rural Municipality","Kawasoti Municipality","Hupsekot Rural Municipality",
                "Madhyabindu Municipality","Binayi-Tribeni Rural Municipality","Gaidakot Municipality","Bulingtar Rural Municipality","Devchuli Municipality"));
        municipalityAndDistrictMapping.put("Lamjung",Arrays.asList("Sundarbazar Municipality","Beshisahar Municipality","Dordi Rural Municipality","Doodhpokhari Rural Municipality",
                "Marsyangdi Rural Municipality","Kwholasothar Rural Municipality","Rainas Municipality","Madhyanepal Municipality"));
        municipalityAndDistrictMapping.put("Gorkha",Arrays.asList("Bhimsen Thapa Rural Municipality","Gorkha Municipality","Barpak Sulikot Rural Municipality",
                "Siranchok Rural Municipality","Ajirkot Rural Municipality","Dharche Rural Municipality","Chumnubri Rural Municipality","Gandaki Rural Municipality",
                "Aarughat Rural Municipality","Palungtar Municipality","Shahid Lakhan Rural Municipality"));
        municipalityAndDistrictMapping.put("Myagdi",Arrays.asList("Malika Rural Municipality","Dhawalagiri Rural Municipality","Mangala Rural Municipality",
                "Beni Municipality","Raghuganga Rural Municipality","Annapurna Rural Municipality"));
        municipalityAndDistrictMapping.put("Syangja",Arrays.asList("Arjunchaupari Rural Municipality","Harinas Rural Municipality","Bheerkot Municipality",
                "Galyang Municipality","Waling Municipality","Kaligandaki Rural Municipality","Putalibazar Municipality","Aandhikhola Rural Municipality",
                "Biruwa Rural Municipality","Phedikhola Rural Municipality","Chapakot Municipality"));
        municipalityAndDistrictMapping.put("Tanahun",Arrays.asList("Vyas Municipality","Myagde Rural Municipality","Aanbookhaireni Rural Municipality",
                "Bhanu Municipality","Bhimad Municipality","Devghat Rural Municipality","Bandipur Rural Municipality","Shuklagandaki Municipality",
                "Ghiring Rural Municipality","Rishing Rural Municipality"));
        municipalityAndDistrictMapping.put("Kaski",Arrays.asList("Madi Rural Municipality","Annapurna Rural Municipality","Pokhara  Metropolitan City",
                "Machhapuchhre Rural Municipality","Rupa Rural Municipality"));
        municipalityAndDistrictMapping.put("Baglung",Arrays.asList("Tamankhola Rural Municipality","Baglung Municipality","Kathekhola Rural Municipality",
                "Tarakhola Rural Municipality","Dhorpatan Municipality","Galkot Municipality","Jaimini Municipality","Badhigad Rural Municipality",
                "Nisikhola Rural Municipality","Bareng Rural Municipality"));
        municipalityAndDistrictMapping.put("Manang",Arrays.asList("Manang Ngisyang Rural Municipality","Nason Rural Municipality","Chame Rural Municipality",
                "Narpa Bhumi Rural Municipality"));
        municipalityAndDistrictMapping.put("Mustang",Arrays.asList("Lo-Ghekar Damodarkunda Rural Municipality","Gharapjhong Rural Municipality","Lomanthang Rural Municipality",
                "Varagung Muktichhetra Rural Municipality","Thasang Rural Municipality"));
        municipalityAndDistrictMapping.put("Parbat",Arrays.asList("Paiyun Rural Municipality","Modi Rural Municipality","Bihadi Rural Municipality",
                "Mahashila Rural Municipality","Kushma Municipality","Phalewas Municipality","Jaljala Rural Municipality"));
        //Lumbini
        municipalityAndDistrictMapping.put("Pyuthan",Arrays.asList("Mallarani Rural Municipality","Swargadwari Municipality","Mandavi Rural Municipality",
                "Naubahini Rural Municipality","Gaumukhi Rural Municipality","Pyuthan Municipality","Airawati Rural Municipality","Jhimruk Rural Municipality",
                "Sarumarani Rural Municipality"));
        municipalityAndDistrictMapping.put("Banke",Arrays.asList("Raptisonari Rural Municipality","Baijanath Rural Municipality","Narainapur Rural Municipality",
                "Duduwa Rural Municipality","Janaki Rural Municipality","Nepalgunj Sub Metropolitan City","Kohalpur Municipality","Khajura Rural Municipality"));
        municipalityAndDistrictMapping.put("Rupandehi",Arrays.asList("Kotahimai Rural Municipality","Lumbini Sanskritik Municipality","Mayadevi Rural Municipality",
                "Marchawari Rural Municipality","Devdaha Municipality","Omsatiya Rural Municipality","Gaidahawa  Rural Municipality","Siyari Rural Municipality",
                "Kanchan Rural Municipality","Sainamaina Municipality","Tilottama Municipality","Rohini Rural Municipality","Siddharthanagar Municipality",
                "Butwal Sub Metropolitan City","Shuddhododan Rural Municipality","Sammarimai Rural Municipality"));
        municipalityAndDistrictMapping.put("Rolpa",Arrays.asList("Lungri Rural Municipality","Sunchhahari Rural Municipality","Triveni Rural Municipality",
                "Madi Rural Municipality","Runtigadhi Rural Municipality","Rolpa Municipality","Gangadev Rural Municipality","Thabang Rural Municipality",
                "Sunilsmriti Rural Municipality","Paribartan Rural Municipality"));
        municipalityAndDistrictMapping.put("Dang",Arrays.asList("Ghorahi Sub Metropolitan City","Babai Rural Municipality","Bangalachuli Rural Municipality",
                "Dangisharan Rural Municipality","Tulsipur Sub Metropolitan City","Rapti Rural Municipality","Shantinagar Rural Municipality","Rajpur Rural Municipality",
                "Gadhawa Rural Municipality","Lamahi Municipality"));
        municipalityAndDistrictMapping.put("Eastern Rukum",Arrays.asList("Putha uttarganga Rural Municipality","Bhume Rural Municipality","Sisne Rural Municipality"));
        municipalityAndDistrictMapping.put("Arghakhanchi",Arrays.asList("Malarani Rural Municipality","Sandhikharka Municipality","Shitaganga Municipality","Panini Rural Municipality",
                "Chhatradev Rural Municipality","Bhumikasthan Municipality"));
        municipalityAndDistrictMapping.put("Palpa",Arrays.asList("Rambha Rural Municipality","Tinau Rural Municipality","Rainadevi Chhahara Rural Municipality",
                "Mathagadhi Rural Municipality","Ribdikot Rural Municipality","Rampur Municipality","Tansen Municipality","Purbakhola Rural Municipality",
                "Baganaskali Rural Municipality","Nisdi Rural Municipality"));
        municipalityAndDistrictMapping.put("Kapilvastu",Arrays.asList("Buddhabhumi  Municipality","Yashodhara Rural Municipality","Kapilvastu Municipality",
                "Shudhdodan Rural Municipality","Bijaynagar Rural Municipality","Shivraj Municipality","Mayadevi Rural Municipality","Banganga Municipality",
                "Maharajgunj Municipality","Krishnanagar Municipality"));
        municipalityAndDistrictMapping.put("Bardiya",Arrays.asList("Madhuwan Municipality","Badhaiyatal Rural Municipality","Bansgadhi Municipality","Barbardiya Municipality",
                "Rajapur Municipality","Geruwa Rural Municipality","Gulariya Municipality","Thakurbaba Municipality"));
        municipalityAndDistrictMapping.put("Nawalparasi West",Arrays.asList("Susta Rural Municipality","Ramgram Municipality","Bardaghat Municipality","Sarawal Rural Municipality",
                "Pratappur Rural Municipality","Palhinandan Rural Municipality","Sunwal Municipality"));
        municipalityAndDistrictMapping.put("Gulmi",Arrays.asList("Ruruchhetra Rural Municipality","Malika Rural Municipality","Madane Rural Municipality",
                "Dhurkot Rural Municipality","Gulmidarbar Rural Municipality","Chhatrakot Rural Municipality","Kaligandaki Rural Municipality","Resunga Municipality",
                "Isma Rural Municipality","Satyawati Rural Municipality","Musikot Municipality","Chandrakot Rural Municipality"));
        //Madesh
        municipalityAndDistrictMapping.put("Rautahat",Arrays.asList("Katahariya Municipality","Durgabhagawati  Rural Municipality","Paroha Municipality",
                "Yamunamai Rural Municipality","Baudhimai Municipality","Rajpur Municipality","Maulapur Municipality","Madhav Narayan Municipality",
                "Brindawan Municipality","Chandrapur Municipality","Ishnath Municipality","Phatuwa Bijaypur Municipality","Gujara Municipality",
                "Garuda Municipality","Gadhimai Municipality","Gaur Municipality","Dewahigonahi Municipality","Rajdevi Municipality"));
        municipalityAndDistrictMapping.put("Parsa",Arrays.asList("Birgunj Metropolitan City","Paterwa Sugauli Rural Municipality","Dhobini Rural Municipality",
                "Chhipaharmai Rural Municipality","Jagarnathpur Rural Municipality","Bahudaramai Municipality","Jirabhawani Rural Municipality","Sakhuwa Prasauni Rural Municipality",
                "Thori Rural Municipality","Kalikamai Rural Municipality","Pokhariya Municipality","Pakaha Mainpur Rural Municipality","Bindabasini Rural Municipality","Parsagadhi Municipality"));
        municipalityAndDistrictMapping.put("Dhanusha",Arrays.asList("Janaknandini Rural Municipality","Dhanauji Rural Municipality","Kamala  Municipality",
                "Bateshwor Rural Municipality","Janakpurdham Sub Metropolitan City","Sabaila Municipality","Bideha Municipality",
                "Ganeshman Charnath Municipality","Dhanushadham Municipality","Nagrain Municipality","Mithila Municipality","Mithila Bihari Municipality",
                "Hansapur Municipality","Laxminiya Rural Municipality","Mukhiyapatti Musaharniya Rural Municipality","Kshireshwornath Municipality",
                "Aurahi Rural Municipality","Shahidnagar Municipality"));
        municipalityAndDistrictMapping.put("Mahottari",Arrays.asList("Samsi Rural Municipality","Manra Shiswa Municipality","Ramgopalpur Municipality","Bhangaha Municipality",
                "Jaleshwor Municipality","Pipra Rural Municipality","Aurahi Municipality","Matihani Municipality","Sonma Rural Municipality","Loharpatti Municipality",
                "Mahottari Rural Municipality","Balwa Municipality","Bardibas Municipality","Ekdara Rural Municipality","Gaushala Municipality"));
        municipalityAndDistrictMapping.put("Saptari",Arrays.asList("Bishnupur Rural Municipality","Dakneshwori Municipality","Rajgadh Rural Municipality",
                "Chhinnamasta Rural Municipality","Agnisair Krishnasawaran Rural Municipality","Shambhunath Municipality","Balan-Bihul Rural Municipality",
                "Surunga Municipality","Mahadeva Rural Municipality","Saptakoshi Municipality","Kanchanrup Municipality","Khadak Municipality",
                "Rajbiraj Municipality","Tirahut Rural Municipality","Tilathi Koiladi Rural Municipality","Hanumannagar Kankalini Municipality","Rupani Rural Municipality",
                "Bode Barsain Municipality"));
        municipalityAndDistrictMapping.put("Bara",Arrays.asList("Karaiyamai Rural Municipality","Aadarsha Kotwal Rural Municipality","Pheta Rural Municipality","Suwarna Rural Municipality",
                "Mahagadhimai Municipality","Parwanipur Rural Municipality","Jeetpursimara Sub Metropolitan City","Simraungadh Municipality","Kalaiya Sub Metropolitan City",
                "Nijgadh Municipality","Prasauni Rural Municipality","Bishrampur Rural Municipality","Pachrauta Municipality","Devtal Rural Municipality",
                "Kolhawi Municipality","Baragadhi Rural Municipality"));
        municipalityAndDistrictMapping.put("Siraha",Arrays.asList("Sakhuwanankarkatti Rural Municipality","Siraha Municipality","Bhagawanpur Rural Municipality",
                "Nawarajpur Rural Municipality","Kalyanpur Municipality","Sukhipur Municipality","Bishnupur Rural Municipality","Naraha Rural Municipality",
                "Bariyarpatti Rural Municipality","Dhangadhimai Municipality","Aurahi Rural Municipality","Golbazar Municipality","Mirchaiya Municipality",
                "Lahan Municipality","Arnama Rural Municipality","Karjanha Municipality","Laxmipur Patari Rural Municipality"));
        municipalityAndDistrictMapping.put("Sarlahi",Arrays.asList("Basbariya Rural Municipality","Kabilasi Municipality","Kaudena Rural Municipality",
                "Parsa Rural Municipality","Hariwan Municipality","Chakraghatta Rural Municipality","Haripurwa Municipality","Dhankaul Rural Municipality",
                "Chandranagar Rural Municipality","Balara Municipality","Lalbandi Municipality","Ishworpur Municipality","Bagmati Municipality","Brahampuri Rural Municipality",
                "Haripur Municipality","Bishnu Rural Municipality","Malangwa Municipality","Barhathawa Municipality","Ramnagar Rural Municipality","Godaita Municipality"));

        //Karnali
        municipalityAndDistrictMapping.put("Dailekh",Arrays.asList("Naumule Rural Municipality","Chamunda Bindrasaini Municipality","Mahabu Rural Municipality",
                "Dungeshwori Rural Municipality","Dullu Municipality","Narayan Municipality","Bhagawatimai Rural Municipality","Aathabis Municipality",
                "Gurans Rural Municipality","Bhairabi Rural Municipality","Thatikandh Rural Municipality"));
        municipalityAndDistrictMapping.put("Dolpa",Arrays.asList("Mudkechula Rural Municipality","Tripurasundari Municipality","She-Phoksundo Rural Municipality",
                "Thuli Bheri Municipality","Jagadulla Rural Municipality","Dolpo Buddha Rural Municipality","Kaike Rural Municipality","Chharka Tangsong Rural Municipality"));
        municipalityAndDistrictMapping.put("Salyan",Arrays.asList("Chhatreshwori Rural Municipality","Darma Rural Municipality","Kapurkot Rural Municipality",
                "Bangad Kupinde Municipality","Kalimati Rural Municipality","Siddha Kumakh Rural Municipality","Sharada Municipality","Kumakh Rural Municipality",
                "Bagchaur Municipality","Triveni Rural Municipality"));
        municipalityAndDistrictMapping.put("Mugu",Arrays.asList("Chhayanath Rara Municipality","Soru Rural Municipality","Khatyad Rural Municipality","Mugumkarmarong Rural Municipality"));
        municipalityAndDistrictMapping.put("Jajarkot",Arrays.asList("Nalgaad Municipality","Chhedagad Municipality","Barekot Rural Municipality","Shivalaya Rural Municipality",
                "Kushe Rural Municipality","Bheri Municipality","Junichaande Rural Municipality"));
        municipalityAndDistrictMapping.put("Western Rukum",Arrays.asList("Sanibheri Rural Municipality","Chaurjahari Municipality","Banphikot Rural Municipality",
                "Musikot Municipality","Triveni Rural Municipality","Aathbiskot Municipality"));
        municipalityAndDistrictMapping.put("Jumla",Arrays.asList("Patarasi Rural Municipality","Hima Rural Municipality","Tatopani Rural Municipality",
                "Tila Rural Municipality","Guthichaur Rural Municipality","Sinja Rural Municipality","Kanakasundari Rural Municipality","Chandannath Municipality"));
        municipalityAndDistrictMapping.put("Humla",Arrays.asList("Sarkegad Rural Municipality","Simkot Rural Municipality","Namkha Rural Municipality","Tanjakot Rural Municipality",
                "Kharpunath Rural Municipality","Adanchuli Rural Municipality","Chankheli Rural Municipality"));
        municipalityAndDistrictMapping.put("Kalikot",Arrays.asList("Khandachakra Municipality","Naraharinath Rural Municipality","Pachaljharana Rural Municipality",
                "Palata Rural Municipality","Raskot Municipality","Sanni Triveni Rural Municipality","Tilagupha Municipality","Mahawai Rural Municipality","Shubha Kalika Rural Municipality"));
        municipalityAndDistrictMapping.put("Surkhet",Arrays.asList("Simta Rural Municipality","Barahatal Rural Municipality","Birendranagar Municipality",
                "Bheriganga Municipality","Panchapuri Municipality","Lekbeshi Municipality","Chaukune Rural Municipality","Gurbhakot Municipality","Chingad Rural Municipality"));

        // Sudurpashchim
        municipalityAndDistrictMapping.put("Kailali",Arrays.asList("Ghodaghodi Municipality","Godawari Municipality","Kailari Rural Municipality",
                "Janaki Rural Municipality","Tikapur Municipality","Bardagoriya Rural Municipality","Joshipur Rural Municipality",
                "Dhangadhi Sub Metropolitan City","Lamkichuha Municipality","Bhajani Municipality","Gauriganga Municipality","Mohanyal Rural Municipality","Chure Rural Municipality"));
        municipalityAndDistrictMapping.put("Kanchanpur",Arrays.asList("Punarbas Municipality","Shuklaphanta Municipality","Beldandi Rural Municipality",
                "Mahakali Municipality","Bheemdatta Municipality","Bedkot Municipality","Krishnapur Municipality","Laljhadi Rural Municipality","Belauri Municipality"));
        municipalityAndDistrictMapping.put("Bajura",Arrays.asList("Swamikartik Khapar Rural Municipality","Badimalika Municipality","Budhinanda Municipality",
                "Khaptad Chhededaha Rural Municipality","Jagannath Rural Municipality","Budhiganga Municipality","Himali Rural Municipality",
                "Gaumul Rural Municipality","Triveni Municipality"));
        municipalityAndDistrictMapping.put("Bajhang",Arrays.asList("Khaptadchhanna Rural Municipality","Surma Rural Municipality","Talkot Rural Municipality",
                "Chhabispathivera Rural Municipality","Masta Rural Municipality","Bitthadchir Rural Municipality","Thalara Rural Municipality"
                ,"Jayaprithvi Municipality","Durgathali Rural Municipality","Kedarsyu Rural Municipality","Saipal Rural Municipality","Bungal Municipality"));
        municipalityAndDistrictMapping.put("Baitadi",Arrays.asList("Melauli Municipality","Dasharathchand Municipality","Purchaudi Municipality",
                "Shivanath Rural Municipality","Deelasaini Rural Municipality","Dogdakedar Rural Municipality","Patan Municipality","Sigas Rural Municipality",
                "Pancheshwor Rural Municipality","Sunarya Rural Municipality"));
        municipalityAndDistrictMapping.put("Doti",Arrays.asList("Dipayal Silgadhi Municipality","Badikedar Rural Municipality","Aadarsha Rural Municipality",
                "Jorayal Rural Municipality","Bogatan Phudsil Rural Municipality","Shikhar Municipality","K.I. Singh Rural Municipality","Sayal Rural Municipality"));
        municipalityAndDistrictMapping.put("Dadeldhura",Arrays.asList("Ganyapadhura Rural Municipality","Amargadhi Municipality","Aalital Rural Municipality",
                "Parshuram Municipality","Navadurga Rural Municipality","Ajayameru Rural Municipality","Bhageshwor Rural Municipality"));
        municipalityAndDistrictMapping.put("Darchula",Arrays.asList("Mahakali Municipality","Marma Rural Municipality","Naugad Rural Municipality",
                "Shailyashikhar Municipality","Apihimal Rural Municipality","Malikarjun Rural Municipality","Duhun Rural Municipality","Vyans Rural Municipality",
                "Lekam Rural Municipality"));
        municipalityAndDistrictMapping.put("Achham",Arrays.asList("Mellekh Rural Municipality","Chaurpati Rural Municipality","Dhakari Rural Municipality",
                "Sanfebagar Municipality","Turmakhand Rural Municipality","Bannigadhi Jaygadh Rural Municipality","Panchadewal Binayak Municipality",
                "Ramaroshan Rural Municipality","Mangalsen Municipality","Kamalbazar Municipality"));

        //Province 1
        municipalityAndDistrictMapping.put("Khotang",Arrays.asList("Kepilasgadhi Rural Municipality","Barahapokhari Rural Municipality",
                "Aiselukharka Rural Municipality","Diprung Chuichumma Rural Municipality", "Rawa Besi Rural Municipality", "Khotehang Rural Municipality",
                "Sakela Rural Municipality","Diktel Rupakot Majhuwagadhi Municipality","Halesi Tuwachung Municipality","Jantedhunga Rural Municipality"));
        municipalityAndDistrictMapping.put("Okhaldhunga",Arrays.asList("Manebhanjyang Rural Municipality","Molung Rural Municipality",
                "Chishankhugadhi Rural Municipality","Likhu Rural Municipality","Sunkoshi Rural Municipality","Champadevi Rural Municipality",
                "Khijidemba Rural Municipality","Sidhicharan Municipality"));
        municipalityAndDistrictMapping.put("Jhapa",Arrays.asList("Kanakai Municipality","Barhadashi Rural Municipality","Shivasatakshi Municipality",
                "Damak Municipality","Gaurigunj Rural Municipality","Buddhashanti Rural Municipality","Gauradaha Municipality","Jhapa Rural Municipality",
                "Kachankawal Rural Municipality","Arjundhara Municipality","Haldibari Rural Municipality","Bhadrapur Municipality","Birtamod Municipality",
                "Mechinagar Municipality","Kamal Rural Municipality"));
        municipalityAndDistrictMapping.put("Ilam",Arrays.asList("Phakphokthum Rural Municipality","Mangsebung Rural Municipality","Maijogmai Rural Municipality",
                "Ilam Municipality","Suryodaya Municipality","Deumai Municipality","Sandakpur Rural Municipality","Chulachuli Rural Municipality",
                "Mai Municipality","Rong Rural Municipality"));
        municipalityAndDistrictMapping.put("Sunsari",Arrays.asList("Koshi Rural Municipality","Barju Rural Municipality","Harinagar Rural Municipality",
                "Ramdhuni Municipality","Dewanganj Rural Municipality","Dharan Sub Metropolitan City","Bhokraha Narsingh Rural Municipality",
                "Gadhi Rural Municipality","Inaruwa Municipality","Itahari Sub Metropolitan City","Duhabi Municipality","Barahakshetra Municipality"));
        municipalityAndDistrictMapping.put("Sankhuwasabha",Arrays.asList("Panchkhapan Municipality","Chichila Rural Municipality","Silichong Rural Municipality",
                "Savapokhari Rural Municipality","Makalu Rural Municipality","Khandbari Municipality","Madi Municipality","Chainpur  Municipality",
                "Bhotkhola Rural Municipality","Dharmadevi Municipality"));
        municipalityAndDistrictMapping.put("Bhojpur",Arrays.asList("Tyamkemaiyung Rural Municipality","Hatuwagadhi Rural Municipality",
                "Arun Rural Municipality","Pauwadungma Rural Municipality","Shadananda Municipality","Salpasilichho Rural Municipality",
                "Bhojpur Municipality","Ramprasadrai Rural Municipality","Aamchowk Rural Municipality"));
        municipalityAndDistrictMapping.put("Solukhumbu",Arrays.asList("Solududhkunda Municipality","Mahakulung Rural Municipality",
                "Sotang Rural Municipality","Mapya Dudhkoshi Rural Municipality","Nechasalyan Rural Municipality","Likhu Pike Rural Municipality",
                "Thulung Dudhkoshi Rural Municipality","Khumbu Pasanglhamu Rural Municipality"));
        municipalityAndDistrictMapping.put("Morang",Arrays.asList("Jahada Rural Municipality","Ratuwamai Municipality",
                "Dhanapalthan Rural Municipality","Letang Municipality","Rangeli Municipality","Biratnagar Metropolitan City","Sundarharaincha Municipality",
                "Uralabari Municipality","Miklajung Rural Municipality","Kerabari Rural Municipality","Gramthan Rural Municipality","Belbari Municipality",
                "Budhiganga Rural Municipality","Kanepokhari Rural Municipality","Sunwarshi Municipality","Pathari Sanishchare Municipality",
                "Katahari Rural Municipality"));
        municipalityAndDistrictMapping.put("Panchthar",Arrays.asList("Phalgunanda Rural Municipality","Miklajung Rural Municipality",
                "Kummayak Rural Municipality","Tumwewa Rural Municipality","Hilihang Rural Municipality","Phalelung Rural Municipality","Yangwarak Rural Municipality",
                "Phidim Municipality"));
        municipalityAndDistrictMapping.put("Dhankuta",Arrays.asList("Pakhribas Municipality","Sangurigadhi Rural Municipality","Mahalaxmi Municipality",
                "Choubise Rural Municipality","Shahidbhumi Rural Municipality","Chhathar Jorpati Rural Municipality","Dhankuta Municipality"));
        municipalityAndDistrictMapping.put("Udayapur",Arrays.asList("Limchunbung Rural Municipality","Rautamai Rural Municipality","Chaudandigadhi Municipality",
                "Udayapurgadhi Rural Municipality","Belaka Municipality","Triyuga Municipality","Tapli Rural Municipality","Katari Municipality"));
        municipalityAndDistrictMapping.put("Taplejung",Arrays.asList("Phaktanglung Rural Municipality","Phungling Municipality","Sirijangha Rural Municipality",
                "Maiwakhola Rural Municipality","Pathibhara Yangwarak Rural Municipality","Meringden Rural Municipality","Mikwakhola Rural Municipality",
                "Sidingba Rural Municipality","Aathrai Tribeni Rural Municipality"));
        municipalityAndDistrictMapping.put("Tehrathum",Arrays.asList("Phedap Rural Municipality","Menchhayayem Rural Municipality",
                "Laligurans Municipality","Chhathar Rural Municipality","Aathrai Rural Municipality","Myanglung Municipality"));
    }
}
