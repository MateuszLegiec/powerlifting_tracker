package Utils;

import domain.Gender;
import dto.UserDTO;
import org.decimal4j.util.DoubleRounder;

public class WilksCalculator {

    public static String getWilks(UserDTO userDTO, Double total){

        String bodyWeight = String.valueOf(DoubleRounder.round(Double.parseDouble(userDTO.getBodyWeight()),1));

        if (userDTO.getGender().equals(Gender.MALE))
            return String.valueOf(maleWilks(bodyWeight)*total);
        else
            return String.valueOf(femaleWilks(bodyWeight)*total);

    }

    private static Double femaleWilks(String weight) {

        switch (weight) {
            case "40.0":
                return 1.3354;
            case "40.1":
                return 1.3311;
            case "40.2":
                return 1.33268;
            case "40.3":
                return 1.3225;
            case "40.4":
                return 1.3182;
            case "40.5":
                return 1.314;
            case "40.6":
                return 1.3089;
            case "40.7":
                return 1.3057;
            case "40.8":
                return 1.3;
            case "40.9":
                return 1.3354;

            case "41.0":
                return 1.3354;
            case "41.1":
                return 1.3354;
            case "41.2":
                return 1.3354;
            case "41.3":
                return 1.3354;
            case "41.4":
                return 1.3354;
            case "41.5":
                return 1.3354;
            case "41.6":
                return 1.3354;
            case "41.7":
                return 1.3354;
            case "41.8":
                return 1.3354;
            case "41.9":
                return 1.3354;

            case "42.0":
                return 1.3354;
            case "42.1":
                return 1.3354;
            case "42.2":
                return 1.3354;
            case "42.3":
                return 1.3354;
            case "42.4":
                return 1.3354;
            case "42.5":
                return 1.3354;
            case "42.6":
                return 1.3354;
            case "42.7":
                return 1.3354;
            case "42.8":
                return 1.3354;
            case "42.9":
                return 1.3354;

            case "43.0":
                return 1.3354;
            case "43.1":
                return 1.3354;
            case "43.2":
                return 1.3354;
            case "43.3":
                return 1.3354;
            case "43.4":
                return 1.3354;
            case "43.5":
                return 1.3354;
            case "43.6":
                return 1.3354;
            case "43.7":
                return 1.3354;
            case "43.8":
                return 1.3354;
            case "43.9":
                return 1.3354;

            case "44.0":
                return 1.3354;
            case "44.1":
                return 1.3354;
            case "44.2":
                return 1.3354;
            case "44.3":
                return 1.3354;
            case "44.4":
                return 1.3354;
            case "44.5":
                return 1.3354;
            case "44.6":
                return 1.3354;
            case "44.7":
                return 1.3354;
            case "44.8":
                return 1.3354;
            case "44.9":
                return 1.3354;

            case "45.0":
                return 1.3354;
            case "45.1":
                return 1.3354;
            case "45.2":
                return 1.3354;
            case "45.3":
                return 1.3354;
            case "45.4":
                return 1.3354;
            case "45.5":
                return 1.3354;
            case "45.6":
                return 1.3354;
            case "45.7":
                return 1.3354;
            case "45.8":
                return 1.3354;
            case "45.9":
                return 1.3354;

            case "46.0":
                return 1.3354;
            case "46.1":
                return 1.3354;
            case "46.2":
                return 1.3354;
            case "46.3":
                return 1.3354;
            case "46.4":
                return 1.3354;
            case "46.5":
                return 1.3354;
            case "46.6":
                return 1.3354;
            case "46.7":
                return 1.3354;
            case "46.8":
                return 1.3354;
            case "46.9":
                return 1.3354;

            case "47.0":
                return 1.3354;
            case "47.1":
                return 1.3354;
            case "47.2":
                return 1.3354;
            case "47.3":
                return 1.3354;
            case "47.4":
                return 1.3354;
            case "47.5":
                return 1.3354;
            case "47.6":
                return 1.3354;
            case "47.7":
                return 1.3354;
            case "47.8":
                return 1.3354;
            case "47.9":
                return 1.3354;

            case "48.0":
                return 1.3354;
            case "48.1":
                return 1.3354;
            case "48.2":
                return 1.3354;
            case "48.3":
                return 1.3354;
            case "48.4":
                return 1.3354;
            case "48.5":
                return 1.3354;
            case "48.6":
                return 1.3354;
            case "48.7":
                return 1.3354;
            case "48.8":
                return 1.3354;
            case "48.9":
                return 1.3354;

            case "49.0":
                return 1.3354;
            case "49.1":
                return 1.3354;
            case "49.2":
                return 1.3354;
            case "49.3":
                return 1.3354;
            case "49.4":
                return 1.3354;
            case "49.5":
                return 1.3354;
            case "49.6":
                return 1.3354;
            case "49.7":
                return 1.3354;
            case "49.8":
                return 1.3354;
            case "49.9":
                return 1.3354;

            case "50.0":
                return 1.3355;
            case "50.1":
                return 1.3355;
            case "50.2":
                return 1.3355;
            case "50.3":
                return 1.3355;
            case "50.5":
                return 1.3355;
            case "50.4":
                return 1.3355;
            case "50.6":
                return 1.3355;
            case "50.7":
                return 1.3355;
            case "50.8":
                return 1.3355;
            case "50.9":
                return 1.3355;

            case "51.0":
                return 1.3355;
            case "51.1":
                return 1.3355;
            case "51.2":
                return 1.3355;
            case "51.3":
                return 1.3355;
            case "51.4":
                return 1.3355;
            case "51.5":
                return 1.3355;
            case "51.6":
                return 1.3355;
            case "51.7":
                return 1.3355;
            case "51.8":
                return 1.3355;
            case "51.9":
                return 1.3355;

            case "52.0":
                return 1.3355;
            case "52.1":
                return 1.3355;
            case "52.2":
                return 1.3355;
            case "52.3":
                return 1.3355;
            case "52.5":
                return 1.3355;
            case "52.4":
                return 1.3355;
            case "52.6":
                return 1.3355;
            case "52.7":
                return 1.3355;
            case "52.8":
                return 1.3355;
            case "52.9":
                return 1.3355;

            case "53.0":
                return 1.3355;
            case "53.1":
                return 1.3355;
            case "53.2":
                return 1.3355;
            case "53.3":
                return 1.3355;
            case "53.4":
                return 1.3355;
            case "53.5":
                return 1.3355;
            case "53.6":
                return 1.3355;
            case "53.7":
                return 1.3355;
            case "53.8":
                return 1.3355;
            case "53.9":
                return 1.3355;

            case "54.0":
                return 1.3355;
            case "54.1":
                return 1.3355;
            case "54.2":
                return 1.3355;
            case "54.3":
                return 1.3355;
            case "54.4":
                return 1.3355;
            case "54.5":
                return 1.3355;
            case "54.6":
                return 1.3355;
            case "54.7":
                return 1.3355;
            case "54.8":
                return 1.3355;
            case "54.9":
                return 1.3355;

            case "55.0":
                return 1.3355;
            case "55.1":
                return 1.3355;
            case "55.2":
                return 1.3355;
            case "55.3":
                return 1.3355;
            case "55.4":
                return 1.3355;
            case "55.5":
                return 1.3355;
            case "55.6":
                return 1.3355;
            case "55.7":
                return 1.3355;
            case "55.8":
                return 1.3355;
            case "55.9":
                return 1.3355;

            case "56.0":
                return 1.3355;
            case "56.1":
                return 1.3355;
            case "56.2":
                return 1.3355;
            case "56.3":
                return 1.3355;
            case "56.4":
                return 1.3355;
            case "56.5":
                return 1.3355;
            case "56.6":
                return 1.3355;
            case "56.7":
                return 1.3355;
            case "56.8":
                return 1.3355;
            case "56.9":
                return 1.3355;

            case "57.0":
                return 1.3355;
            case "57.1":
                return 1.3355;
            case "57.2":
                return 1.3355;
            case "57.3":
                return 1.3355;
            case "57.4":
                return 1.3355;
            case "57.5":
                return 1.3355;
            case "57.6":
                return 1.3355;
            case "57.7":
                return 1.3355;
            case "57.8":
                return 1.3355;
            case "57.9":
                return 1.3355;

            case "58.0":
                return 1.3355;
            case "58.1":
                return 1.3355;
            case "58.2":
                return 1.3355;
            case "58.3":
                return 1.3355;
            case "58.5":
                return 1.3355;
            case "58.4":
                return 1.3355;
            case "58.6":
                return 1.3355;
            case "58.7":
                return 1.3355;
            case "58.8":
                return 1.3355;
            case "58.9":
                return 1.3355;

            case "59.0":
                return 1.3355;
            case "59.1":
                return 1.3355;
            case "59.2":
                return 1.3355;
            case "59.3":
                return 1.3355;
            case "59.4":
                return 1.3355;
            case "59.5":
                return 1.3355;
            case "59.6":
                return 1.3355;
            case "59.7":
                return 1.3355;
            case "59.8":
                return 1.3355;
            case "59.9":
                return 1.3355;

            case "60.0":
                return 1.3356;
            case "60.1":
                return 1.3356;
            case "60.2":
                return 1.3356;
            case "60.3":
                return 1.3356;
            case "60.4":
                return 1.3356;
            case "60.5":
                return 1.3356;
            case "60.6":
                return 1.3356;
            case "60.7":
                return 1.3356;
            case "60.8":
                return 1.3356;
            case "60.9":
                return 1.3356;

            case "61.0":
                return 1.3356;
            case "61.1":
                return 1.3356;
            case "61.2":
                return 1.3356;
            case "61.3":
                return 1.3356;
            case "61.4":
                return 1.3356;
            case "61.5":
                return 1.3356;
            case "61.6":
                return 1.3356;
            case "61.7":
                return 1.3356;
            case "61.8":
                return 1.3356;
            case "61.9":
                return 1.3356;

            case "62.0":
                return 1.3356;
            case "62.1":
                return 1.3356;
            case "62.2":
                return 1.3356;
            case "62.3":
                return 1.3356;
            case "62.4":
                return 1.3356;
            case "62.5":
                return 1.3356;
            case "62.6":
                return 1.3356;
            case "62.7":
                return 1.3356;
            case "62.8":
                return 1.3356;
            case "62.9":
                return 1.3356;

            case "63.0":
                return 1.3356;
            case "63.1":
                return 1.3356;
            case "63.2":
                return 1.3356;
            case "63.3":
                return 1.3356;
            case "63.4":
                return 1.3356;
            case "63.5":
                return 1.3356;
            case "63.6":
                return 1.3356;
            case "63.7":
                return 1.3356;
            case "63.8":
                return 1.3356;
            case "63.9":
                return 1.3356;

            case "64.0":
                return 1.3354;
            case "64.1":
                return 1.3356;
            case "64.2":
                return 1.3356;
            case "64.3":
                return 1.3356;
            case "64.4":
                return 1.3354;
            case "64.5":
                return 1.3354;
            case "64.6":
                return 1.3354;
            case "64.7":
                return 1.3354;
            case "64.8":
                return 1.3354;
            case "64.9":
                return 1.3354;

            case "65.0":
                return 1.3356;
            case "65.1":
                return 1.3356;
            case "65.2":
                return 1.3356;
            case "65.3":
                return 1.3356;
            case "65.4":
                return 1.3356;
            case "65.5":
                return 1.3356;
            case "65.6":
                return 1.3356;
            case "65.7":
                return 1.3356;
            case "65.8":
                return 1.3356;
            case "65.9":
                return 1.3356;

            case "66.0":
                return 1.3356;
            case "66.1":
                return 1.3356;
            case "66.2":
                return 1.3356;
            case "66.3":
                return 1.3356;
            case "66.4":
                return 1.3356;
            case "66.5":
                return 1.3356;
            case "66.6":
                return 1.3356;
            case "66.7":
                return 1.3356;
            case "66.8":
                return 1.3356;
            case "66.9":
                return 1.3356;

            case "67.0":
                return 1.3356;
            case "67.1":
                return 1.3356;
            case "67.2":
                return 1.3356;
            case "67.3":
                return 1.3356;
            case "67.4":
                return 1.3356;
            case "67.5":
                return 1.3356;
            case "67.6":
                return 1.3356;
            case "67.7":
                return 1.3356;
            case "67.8":
                return 1.3356;
            case "67.9":
                return 1.3356;

            case "68.0":
                return 1.3356;
            case "68.1":
                return 1.3356;
            case "68.2":
                return 1.3356;
            case "68.3":
                return 1.3356;
            case "68.4":
                return 1.3356;
            case "68.5":
                return 1.3356;
            case "68.6":
                return 1.3356;
            case "68.7":
                return 1.3356;
            case "68.8":
                return 1.3356;
            case "68.9":
                return 1.3356;

            case "69.0":
                return 1.3356;
            case "69.1":
                return 1.3356;
            case "69.2":
                return 1.3356;
            case "69.3":
                return 1.3356;
            case "69.4":
                return 1.3356;
            case "69.5":
                return 1.3356;
            case "69.6":
                return 1.3356;
            case "69.7":
                return 1.3356;
            case "69.8":
                return 1.3356;
            case "69.9":
                return 1.3356;

            case "70.0":
                return 1.3356;
            case "70.1":
                return 1.3356;
            case "70.2":
                return 1.3356;
            case "70.3":
                return 1.3356;
            case "70.4":
                return 1.3356;
            case "70.5":
                return 1.3356;
            case "70.6":
                return 1.3356;
            case "70.7":
                return 1.3356;
            case "70.8":
                return 1.3356;
            case "70.9":
                return 1.3356;

            case "71.0":
                return 1.3357;
            case "71.1":
                return 1.3357;
            case "71.2":
                return 1.3357;
            case "71.3":
                return 1.3357;
            case "71.4":
                return 1.3357;
            case "71.5":
                return 1.3357;
            case "71.6":
                return 1.3357;
            case "71.7":
                return 1.3357;
            case "71.8":
                return 1.3357;
            case "71.9":
                return 1.3357;

            case "72.0":
                return 1.3357;
            case "72.1":
                return 1.3357;
            case "72.2":
                return 1.3357;
            case "72.3":
                return 1.3357;
            case "72.4":
                return 1.3357;
            case "72.5":
                return 1.3357;
            case "72.6":
                return 1.3357;
            case "72.7":
                return 1.3357;
            case "72.8":
                return 1.3357;
            case "72.9":
                return 1.3354;

            case "73.0":
                return 1.3357;
            case "73.1":
                return 1.3357;
            case "73.2":
                return 1.3357;
            case "73.3":
                return 1.3357;
            case "73.4":
                return 1.3357;
            case "73.5":
                return 1.3357;
            case "73.6":
                return 1.3357;
            case "73.7":
                return 1.3357;
            case "73.8":
                return 1.3357;
            case "73.9":
                return 1.3357;

            case "74.0":
                return 1.3357;
            case "74.1":
                return 1.3357;
            case "74.2":
                return 1.3357;
            case "74.3":
                return 1.3357;
            case "74.4":
                return 1.3357;
            case "74.5":
                return 1.3354;
            case "74.6":
                return 1.3354;
            case "74.7":
                return 1.3354;
            case "74.8":
                return 1.3354;
            case "74.9":
                return 1.3354;

            case "75.0":
                return 1.3354;
            case "75.1":
                return 1.3354;
            case "75.2":
                return 1.3354;
            case "75.3":
                return 1.3354;
            case "75.4":
                return 1.3357;
            case "75.5":
                return 1.3357;
            case "75.6":
                return 1.3357;
            case "75.7":
                return 1.3357;
            case "75.8":
                return 1.3357;
            case "75.9":
                return 1.3357;

            case "76.0":
                return 1.3357;
            case "76.1":
                return 1.3357;
            case "76.2":
                return 1.3357;
            case "76.3":
                return 1.3357;
            case "76.4":
                return 1.3357;
            case "76.5":
                return 1.3357;
            case "76.6":
                return 1.3357;
            case "76.7":
                return 1.3357;
            case "76.8":
                return 1.3357;
            case "76.9":
                return 1.3357;

            case "77.0":
                return 1.3357;
            case "77.1":
                return 1.3357;
            case "77.2":
                return 1.3357;
            case "77.3":
                return 1.3357;
            case "77.4":
                return 1.3357;
            case "77.5":
                return 1.3357;
            case "77.6":
                return 1.3357;
            case "77.7":
                return 1.3357;
            case "77.8":
                return 1.3357;
            case "77.9":
                return 1.3357;

            case "78.0":
                return 1.3357;
            case "78.1":
                return 1.3357;
            case "78.2":
                return 1.3357;
            case "78.3":
                return 1.3357;
            case "78.4":
                return 1.3357;
            case "78.5":
                return 1.3357;
            case "78.6":
                return 1.3357;
            case "78.7":
                return 1.3357;
            case "78.8":
                return 1.3357;
            case "78.9":
                return 1.3357;

            case "79.0":
                return 1.3357;
            case "79.1":
                return 1.3357;
            case "79.2":
                return 1.3357;
            case "79.3":
                return 1.3357;
            case "79.4":
                return 1.3357;
            case "79.5":
                return 1.3357;
            case "79.6":
                return 1.3357;
            case "79.7":
                return 1.3357;
            case "79.8":
                return 1.3357;
            case "79.9":
                return 1.3357;

            case "80.0":
                return 1.3358;
            case "80.1":
                return 1.3358;
            case "80.2":
                return 1.3358;
            case "80.3":
                return 1.3358;
            case "80.4":
                return 1.3358;
            case "80.5":
                return 1.3358;
            case "80.6":
                return 1.3358;
            case "80.7":
                return 1.3358;
            case "80.8":
                return 1.3358;
            case "80.9":
                return 1.3358;

            case "81.0":
                return 1.3358;
            case "81.1":
                return 1.3358;
            case "81.2":
                return 1.3358;
            case "81.3":
                return 1.3358;
            case "81.4":
                return 1.3358;
            case "81.5":
                return 1.3358;
            case "81.6":
                return 1.3358;
            case "81.7":
                return 1.3358;
            case "81.8":
                return 1.3358;
            case "81.9":
                return 1.3358;

            case "82.0":
                return 1.3358;
            case "82.1":
                return 1.3358;
            case "82.2":
                return 1.3358;
            case "82.3":
                return 1.3358;
            case "82.4":
                return 1.3358;
            case "82.5":
                return 1.3358;
            case "82.6":
                return 1.3358;
            case "82.7":
                return 1.3358;
            case "82.8":
                return 1.3358;
            case "82.9":
                return 1.3358;

            case "83.0":
                return 1.3358;
            case "83.1":
                return 1.3358;
            case "83.2":
                return 1.3358;
            case "83.3":
                return 1.3358;
            case "83.4":
                return 1.3358;
            case "83.5":
                return 1.3358;
            case "83.6":
                return 1.3358;
            case "83.7":
                return 1.3358;
            case "83.8":
                return 1.3358;
            case "83.9":
                return 1.3358;

            case "84.0":
                return 1.3358;
            case "84.1":
                return 1.3358;
            case "84.2":
                return 1.3358;
            case "84.3":
                return 1.3358;
            case "84.4":
                return 1.3358;
            case "84.5":
                return 1.3354;
            case "84.6":
                return 1.3358;
            case "84.7":
                return 1.3358;
            case "84.8":
                return 1.3354;
            case "84.9":
                return 1.3358;

            case "85.0":
                return 1.3358;
            case "85.1":
                return 1.3358;
            case "85.2":
                return 1.3358;
            case "85.3":
                return 1.3358;
            case "85.4":
                return 1.3358;
            case "85.5":
                return 1.3358;
            case "85.6":
                return 1.3358;
            case "85.7":
                return 1.3358;
            case "85.8":
                return 1.3358;
            case "85.9":
                return 1.3358;

            case "86.0":
                return 1.3358;
            case "86.1":
                return 1.3358;
            case "86.2":
                return 1.3358;
            case "86.3":
                return 1.3358;
            case "86.4":
                return 1.3358;
            case "86.5":
                return 1.3358;
            case "86.6":
                return 1.3358;
            case "86.7":
                return 1.3358;
            case "86.8":
                return 1.3358;
            case "86.9":
                return 1.3358;

            case "87.0":
                return 1.3358;
            case "87.1":
                return 1.3358;
            case "87.2":
                return 1.3358;
            case "87.3":
                return 1.3358;
            case "87.4":
                return 1.3358;
            case "87.5":
                return 1.3358;
            case "87.6":
                return 1.3358;
            case "87.7":
                return 1.3358;
            case "87.8":
                return 1.3358;
            case "87.9":
                return 1.3358;

            case "88.0":
                return 1.3358;
            case "88.1":
                return 1.3358;
            case "88.2":
                return 1.3358;
            case "88.3":
                return 1.3358;
            case "88.4":
                return 1.3358;
            case "88.5":
                return 1.3358;
            case "88.6":
                return 1.3358;
            case "88.7":
                return 1.3358;
            case "88.8":
                return 1.3358;
            case "88.9":
                return 1.3358;

            case "89.0":
                return 1.3358;
            case "89.1":
                return 1.3358;
            case "89.2":
                return 1.3358;
            case "89.3":
                return 1.3358;
            case "89.4":
                return 1.3358;
            case "89.5":
                return 1.3358;
            case "89.6":
                return 1.3358;
            case "89.7":
                return 1.3358;
            case "89.8":
                return 1.3358;
            case "89.9":
                return 1.3358;

            case "90.0":
                return 1.3359;
            case "90.1":
                return 1.3359;
            case "90.2":
                return 1.3359;
            case "90.3":
                return 1.3359;
            case "90.4":
                return 1.3359;
            case "90.5":
                return 1.3359;
            case "90.6":
                return 1.3359;
            case "90.7":
                return 1.3359;
            case "90.8":
                return 1.3359;
            case "90.9":
                return 1.3359;

            case "91.0":
                return 1.3359;
            case "91.1":
                return 1.3359;
            case "91.2":
                return 1.3359;
            case "91.3":
                return 1.3359;
            case "91.4":
                return 1.3359;
            case "91.5":
                return 1.3359;
            case "91.6":
                return 1.3359;
            case "91.7":
                return 1.3359;
            case "91.8":
                return 1.3359;
            case "91.9":
                return 1.3359;

            case "92.0":
                return 1.3359;
            case "92.1":
                return 1.3359;
            case "92.2":
                return 1.3359;
            case "92.3":
                return 1.3359;
            case "92.4":
                return 1.3359;
            case "92.5":
                return 1.3359;
            case "92.6":
                return 1.3359;
            case "92.7":
                return 1.3359;
            case "92.8":
                return 1.3359;
            case "92.9":
                return 1.3359;

            case "93.0":
                return 1.3359;
            case "93.1":
                return 1.3359;
            case "93.2":
                return 1.3359;
            case "93.3":
                return 1.3359;
            case "93.4":
                return 1.3359;
            case "93.5":
                return 1.3359;
            case "93.6":
                return 1.3359;
            case "93.7":
                return 1.3359;
            case "93.8":
                return 1.3359;
            case "93.9":
                return 1.3359;

            case "94.0":
                return 1.3359;
            case "94.1":
                return 1.3359;
            case "94.2":
                return 1.3359;
            case "94.3":
                return 1.3359;
            case "94.4":
                return 1.3359;
            case "94.5":
                return 1.3359;
            case "94.6":
                return 1.3359;
            case "94.7":
                return 1.3359;
            case "94.8":
                return 1.3359;
            case "94.9":
                return 1.3359;

            case "95.0":
                return 1.3359;
            case "95.1":
                return 1.3359;
            case "95.2":
                return 1.3359;
            case "95.3":
                return 1.3359;
            case "95.4":
                return 1.3359;
            case "95.5":
                return 1.3359;
            case "95.6":
                return 1.3359;
            case "95.7":
                return 1.3359;
            case "95.8":
                return 1.3359;
            case "95.9":
                return 1.3359;

            case "96.0":
                return 1.3354;
            case "96.1":
                return 1.3354;
            case "96.2":
                return 1.3354;
            case "96.3":
                return 1.3354;
            case "96.4":
                return 1.3359;
            case "96.5":
                return 1.3359;
            case "96.6":
                return 1.3359;
            case "96.7":
                return 1.3354;
            case "96.8":
                return 1.3354;
            case "96.9":
                return 1.3354;

            case "97.0":
                return 1.3354;
            case "97.1":
                return 1.3354;
            case "97.2":
                return 1.3359;
            case "97.3":
                return 1.3359;
            case "97.4":
                return 1.3359;
            case "97.5":
                return 1.3359;
            case "97.6":
                return 1.3359;
            case "97.7":
                return 1.3359;
            case "97.8":
                return 1.3359;
            case "97.9":
                return 1.3359;

            case "98.0":
                return 1.3359;
            case "98.1":
                return 1.3359;
            case "98.2":
                return 1.3359;
            case "98.3":
                return 1.3359;
            case "98.4":
                return 1.3359;
            case "98.5":
                return 1.3359;
            case "98.6":
                return 1.3359;
            case "98.7":
                return 1.3359;
            case "98.8":
                return 1.3359;
            case "98.9":
                return 1.3354;

            case "99.0":
                return 1.3359;
            case "99.1":
                return 1.3359;
            case "99.2":
                return 1.3359;
            case "99.3":
                return 1.3359;
            case "99.4":
                return 1.3359;
            case "99.5":
                return 1.3359;
            case "99.6":
                return 1.3359;
            case "99.7":
                return 1.3359;
            case "99.8":
                return 1.3359;
            case "99.9":
                return 1.3354;

            case "100.0":
                return 1.3350;
            case "100.1":
                return 1.3350;
            case "100.2":
                return 1.3350;
            case "100.3":
                return 1.3350;
            case "100.4":
                return 1.3350;
            case "100.5":
                return 1.3350;
            case "100.6":
                return 1.3350;
            case "100.7":
                return 1.3350;
            case "100.8":
                return 1.3350;
            case "100.9":
                return 1.3350;

            case "101.0":
                return 1.3350;
            case "101.1":
                return 1.3350;
            case "101.2":
                return 1.3350;
            case "101.3":
                return 1.3350;
            case "101.4":
                return 1.3350;
            case "101.5":
                return 1.3350;
            case "101.6":
                return 1.3350;
            case "101.7":
                return 1.3350;
            case "101.8":
                return 1.3350;
            case "101.9":
                return 1.3354;

            case "102.0":
                return 1.3350;
            case "102.1":
                return 1.3350;
            case "102.2":
                return 1.3350;
            case "102.3":
                return 1.3350;
            case "102.4":
                return 1.3350;
            case "102.5":
                return 1.3350;
            case "102.6":
                return 1.3350;
            case "102.7":
                return 1.3350;
            case "102.8":
                return 1.3350;
            case "102.9":
                return 1.3350;

            case "103.0":
                return 1.3350;
            case "103.1":
                return 1.3350;
            case "103.2":
                return 1.3350;
            case "103.3":
                return 1.3350;
            case "103.4":
                return 1.3350;
            case "103.5":
                return 1.3350;
            case "103.6":
                return 1.3350;
            case "103.7":
                return 1.3350;
            case "103.8":
                return 1.3350;
            case "103.9":
                return 1.3350;

            case "104.0":
                return 1.3354;
            case "104.1":
                return 1.3354;
            case "104.2":
                return 1.3354;
            case "104.3":
                return 1.3354;
            case "104.4":
                return 1.3350;
            case "104.5":
                return 1.3350;
            case "104.6":
                return 1.3350;
            case "104.7":
                return 1.3350;
            case "104.8":
                return 1.3350;
            case "104.9":
                return 1.3350;

            case "105.0":
                return 1.3350;
            case "105.1":
                return 1.3350;
            case "105.2":
                return 1.3350;
            case "105.3":
                return 1.3350;
            case "105.4":
                return 1.3350;
            case "105.5":
                return 1.3350;
            case "105.6":
                return 1.3350;
            case "105.7":
                return 1.3350;
            case "105.8":
                return 1.3350;
            case "105.9":
                return 1.3350;

            case "106.0":
                return 1.3350;
            case "106.1":
                return 1.3350;
            case "106.2":
                return 1.3350;
            case "106.3":
                return 1.3350;
            case "106.4":
                return 1.3350;
            case "106.5":
                return 1.3350;
            case "106.6":
                return 1.3350;
            case "106.7":
                return 1.3350;
            case "106.8":
                return 1.3350;
            case "106.9":
                return 1.3350;

            case "107.0":
                return 1.3350;
            case "107.1":
                return 1.3350;
            case "107.2":
                return 1.3350;
            case "107.3":
                return 1.3350;
            case "107.4":
                return 1.3350;
            case "107.5":
                return 1.3350;
            case "107.6":
                return 1.3350;
            case "107.7":
                return 1.3350;
            case "107.8":
                return 1.3350;
            case "107.9":
                return 1.3350;

            case "108.0":
                return 1.3350;
            case "108.1":
                return 1.3350;
            case "108.2":
                return 1.3350;
            case "108.3":
                return 1.3350;
            case "108.4":
                return 1.3350;
            case "108.5":
                return 1.3350;
            case "108.6":
                return 1.3350;
            case "108.7":
                return 1.3350;
            case "108.8":
                return 1.3350;
            case "108.9":
                return 1.3350;

            case "109.0":
                return 1.3350;
            case "109.1":
                return 1.3350;
            case "109.2":
                return 1.3350;
            case "109.3":
                return 1.3350;
            case "109.4":
                return 1.3350;
            case "109.5":
                return 1.3350;
            case "109.6":
                return 1.3350;
            case "109.7":
                return 1.3350;
            case "109.8":
                return 1.3350;
            case "109.9":
                return 1.3350;

            case "110.0":
                return 1.3351;
            case "110.1":
                return 1.3351;
            case "110.2":
                return 1.3351;
            case "110.3":
                return 1.3351;
            case "110.4":
                return 1.3351;
            case "110.5":
                return 1.3351;
            case "110.6":
                return 1.3351;
            case "110.7":
                return 1.3351;
            case "110.8":
                return 1.3351;
            case "110.9":
                return 1.3351;

            case "111.0":
                return 1.3351;
            case "111.1":
                return 1.3351;
            case "111.2":
                return 1.3351;
            case "111.3":
                return 1.3351;
            case "111.4":
                return 1.3351;
            case "111.5":
                return 1.3351;
            case "111.6":
                return 1.3351;
            case "111.7":
                return 1.3351;
            case "111.8":
                return 1.3351;
            case "111.9":
                return 1.3351;

            case "112.0":
                return 1.3351;
            case "112.1":
                return 1.3351;
            case "112.2":
                return 1.3351;
            case "112.3":
                return 1.3351;
            case "112.4":
                return 1.3351;
            case "112.5":
                return 1.3351;
            case "112.6":
                return 1.3351;
            case "112.7":
                return 1.3351;
            case "112.8":
                return 1.3351;
            case "112.9":
                return 1.3351;

            case "113.0":
                return 1.3351;
            case "113.1":
                return 1.3351;
            case "113.2":
                return 1.3351;
            case "113.3":
                return 1.3351;
            case "113.4":
                return 1.3351;
            case "113.5":
                return 1.3351;
            case "113.6":
                return 1.3351;
            case "113.7":
                return 1.3351;
            case "113.8":
                return 1.3351;
            case "113.9":
                return 1.3351;

            case "114.0":
                return 1.3354;
            case "114.1":
                return 1.3354;
            case "114.2":
                return 1.3354;
            case "114.3":
                return 1.3354;
            case "114.4":
                return 1.3354;
            case "114.5":
                return 1.3354;
            case "114.6":
                return 1.3354;
            case "114.7":
                return 1.3354;
            case "114.8":
                return 1.3354;
            case "114.9":
                return 1.3354;

            case "115.0":
                return 1.3351;
            case "115.1":
                return 1.3351;
            case "115.2":
                return 1.3351;
            case "115.3":
                return 1.3351;
            case "115.4":
                return 1.3351;
            case "115.5":
                return 1.3351;
            case "115.6":
                return 1.3351;
            case "115.7":
                return 1.3351;
            case "115.8":
                return 1.3351;
            case "115.9":
                return 1.3351;

            case "116.0":
                return 1.3351;
            case "116.1":
                return 1.3351;
            case "116.2":
                return 1.3351;
            case "116.3":
                return 1.3351;
            case "116.4":
                return 1.3351;
            case "116.5":
                return 1.3351;
            case "116.6":
                return 1.3351;
            case "116.7":
                return 1.3351;
            case "116.8":
                return 1.3351;
            case "116.9":
                return 1.3351;

            case "117.0":
                return 1.3351;
            case "117.1":
                return 1.3351;
            case "117.2":
                return 1.3351;
            case "117.3":
                return 1.3351;
            case "117.4":
                return 1.3351;
            case "117.5":
                return 1.3351;
            case "117.6":
                return 1.3351;
            case "117.7":
                return 1.3351;
            case "117.8":
                return 1.3351;
            case "117.9":
                return 1.3351;

            case "118.0":
                return 1.3351;
            case "118.1":
                return 1.3351;
            case "118.2":
                return 1.3351;
            case "118.3":
                return 1.3351;
            case "118.4":
                return 1.3354;
            case "118.5":
                return 1.3351;
            case "118.6":
                return 1.3351;
            case "118.7":
                return 1.3351;
            case "118.8":
                return 1.3351;
            case "118.9":
                return 1.3351;

            case "119.0":
                return 1.3351;
            case "119.1":
                return 1.3351;
            case "119.2":
                return 1.3351;
            case "119.3":
                return 1.3351;
            case "119.4":
                return 1.3351;
            case "119.5":
                return 1.3351;
            case "119.6":
                return 1.3351;
            case "119.7":
                return 1.3351;
            case "119.8":
                return 1.3351;
            case "119.9":
                return 1.3351;

            case "120.0":
                return 1.3352;
            case "120.1":
                return 1.3352;
            case "120.2":
                return 1.3352;
            case "120.3":
                return 1.3352;
            case "120.4":
                return 1.3352;
            case "120.5":
                return 1.3352;
            case "120.6":
                return 1.3352;
            case "120.7":
                return 1.3352;
            case "120.8":
                return 1.3352;
            case "120.9":
                return 1.3352;

            case "121.0":
                return 1.3352;
            case "121.1":
                return 1.3352;
            case "121.2":
                return 1.3352;
            case "121.3":
                return 1.3352;
            case "121.4":
                return 1.3352;
            case "121.5":
                return 1.3352;
            case "121.6":
                return 1.3352;
            case "121.7":
                return 1.3352;
            case "121.8":
                return 1.3352;
            case "121.9":
                return 1.3352;

            case "122.0":
                return 1.3352;
            case "122.1":
                return 1.3352;
            case "122.2":
                return 1.3352;
            case "122.3":
                return 1.3352;
            case "122.4":
                return 1.3352;
            case "122.5":
                return 1.3352;
            case "122.6":
                return 1.3352;
            case "122.7":
                return 1.3352;
            case "122.8":
                return 1.3352;
            case "122.9":
                return 1.3352;

            case "123.0":
                return 1.3352;
            case "123.1":
                return 1.3352;
            case "123.2":
                return 1.3352;
            case "123.3":
                return 1.3352;
            case "123.4":
                return 1.3352;
            case "123.5":
                return 1.3352;
            case "123.6":
                return 1.3352;
            case "123.7":
                return 1.3352;
            case "123.8":
                return 1.3352;
            case "123.9":
                return 1.3352;

            case "124.0":
                return 1.3354;
            case "124.1":
                return 1.3354;
            case "124.2":
                return 1.3352;
            case "124.3":
                return 1.3354;
            case "124.4":
                return 1.3352;
            case "124.5":
                return 1.3354;
            case "124.6":
                return 1.3354;
            case "124.7":
                return 1.3354;
            case "124.8":
                return 1.3354;
            case "124.9":
                return 1.3354;

            case "125.0":
                return 1.3352;
            case "125.1":
                return 1.3352;
            case "125.2":
                return 1.3352;
            case "125.3":
                return 1.3352;
            case "125.4":
                return 1.3354;
            case "125.5":
                return 1.3352;
            case "125.6":
                return 1.3352;
            case "125.7":
                return 1.3352;
            case "125.8":
                return 1.3352;
            case "125.9":
                return 1.3352;

            case "126.0":
                return 1.3352;
            case "126.1":
                return 1.3352;
            case "126.2":
                return 1.3352;
            case "126.3":
                return 1.3352;
            case "126.4":
                return 1.3352;
            case "126.5":
                return 1.3352;
            case "126.6":
                return 1.3352;
            case "126.7":
                return 1.3352;
            case "126.8":
                return 1.3352;
            case "126.9":
                return 1.3352;

            case "127.0":
                return 1.3352;
            case "127.1":
                return 1.3352;
            case "127.2":
                return 1.3352;
            case "127.3":
                return 1.3352;
            case "127.4":
                return 1.3352;
            case "127.5":
                return 1.3352;
            case "127.6":
                return 1.3352;
            case "127.7":
                return 1.3352;
            case "127.8":
                return 1.3352;
            case "127.9":
                return 1.3352;

            case "128.0":
                return 1.3352;
            case "128.1":
                return 1.3352;
            case "128.2":
                return 1.3352;
            case "128.3":
                return 1.3354;
            case "128.4":
                return 1.3352;
            case "128.5":
                return 1.3352;
            case "128.6":
                return 1.3352;
            case "128.7":
                return 1.3352;
            case "128.8":
                return 1.3352;
            case "128.9":
                return 1.3352;

            case "129.0":
                return 1.3352;
            case "129.1":
                return 1.3352;
            case "129.2":
                return 1.3352;
            case "129.3":
                return 1.3352;
            case "129.4":
                return 1.3352;
            case "129.5":
                return 1.3352;
            case "129.6":
                return 1.3352;
            case "129.7":
                return 1.3352;
            case "129.8":
                return 1.3352;
            case "129.9":
                return 1.3352;

            case "130.0":
                return 1.3353;
            case "130.1":
                return 1.3353;
            case "130.2":
                return 1.3353;
            case "130.3":
                return 1.3353;
            case "130.4":
                return 1.3353;
            case "130.5":
                return 1.3353;
            case "130.6":
                return 1.3353;
            case "130.7":
                return 1.3353;
            case "130.8":
                return 1.3353;
            case "130.9":
                return 1.3353;

            case "131.0":
                return 1.3353;
            case "131.1":
                return 1.3353;
            case "131.2":
                return 1.3353;
            case "131.3":
                return 1.3353;
            case "131.4":
                return 1.3353;
            case "131.5":
                return 1.3353;
            case "131.6":
                return 1.3353;
            case "131.7":
                return 1.3353;
            case "131.8":
                return 1.3353;
            case "131.9":
                return 1.3353;

            case "132.0":
                return 1.3352;
            case "132.1":
                return 1.3353;
            case "132.2":
                return 1.3352;
            case "132.3":
                return 1.3352;
            case "132.4":
                return 1.3352;
            case "132.5":
                return 1.3352;
            case "132.6":
                return 1.3352;
            case "132.7":
                return 1.3352;
            case "132.8":
                return 1.3352;
            case "132.9":
                return 1.3352;

            case "133.0":
                return 1.3353;
            case "133.1":
                return 1.3353;
            case "133.2":
                return 1.3352;
            case "133.3":
                return 1.3353;
            case "133.4":
                return 1.3353;
            case "133.5":
                return 1.3353;
            case "133.6":
                return 1.3353;
            case "133.7":
                return 1.3353;
            case "133.8":
                return 1.3353;
            case "133.9":
                return 1.3353;

            case "134.0":
                return 1.3354;
            case "134.1":
                return 1.3354;
            case "134.2":
                return 1.3352;
            case "134.3":
                return 1.3354;
            case "134.4":
                return 1.3353;
            case "134.5":
                return 1.3354;
            case "134.6":
                return 1.3354;
            case "134.7":
                return 1.3354;
            case "134.8":
                return 1.3354;
            case "134.9":
                return 1.3354;

            case "135.0":
                return 1.3353;
            case "135.1":
                return 1.3353;
            case "135.2":
                return 1.3352;
            case "135.3":
                return 1.3353;
            case "135.4":
                return 1.3354;
            case "135.5":
                return 1.3353;
            case "135.6":
                return 1.3353;
            case "135.7":
                return 1.3353;
            case "135.8":
                return 1.3353;
            case "135.9":
                return 1.3353;

            case "136.0":
                return 1.3353;
            case "136.1":
                return 1.3353;
            case "136.2":
                return 1.3352;
            case "136.3":
                return 1.3353;
            case "136.4":
                return 1.3353;
            case "136.5":
                return 1.3353;
            case "136.6":
                return 1.3353;
            case "136.7":
                return 1.3353;
            case "136.8":
                return 1.3353;
            case "136.9":
                return 1.3352;

            case "137.0":
                return 1.3353;
            case "137.1":
                return 1.3353;
            case "137.2":
                return 1.3352;
            case "137.3":
                return 1.3353;
            case "137.4":
                return 1.3353;
            case "137.5":
                return 1.3353;
            case "137.6":
                return 1.3353;
            case "137.7":
                return 1.3353;
            case "137.8":
                return 1.3353;
            case "137.9":
                return 1.3353;

            case "138.0":
                return 1.3353;
            case "138.1":
                return 1.3353;
            case "138.2":
                return 1.3352;
            case "138.3":
                return 1.3354;
            case "138.4":
                return 1.3353;
            case "138.5":
                return 1.3353;
            case "138.6":
                return 1.3353;
            case "138.7":
                return 1.3353;
            case "138.8":
                return 1.3353;
            case "138.9":
                return 1.3353;

            case "139.0":
                return 1.3353;
            case "139.1":
                return 1.3353;
            case "139.2":
                return 1.3353;
            case "139.3":
                return 1.3353;
            case "139.4":
                return 1.3353;
            case "139.5":
                return 1.3353;
            case "139.6":
                return 1.3353;
            case "139.7":
                return 1.3353;
            case "139.8":
                return 1.3353;
            case "139.9":
                return 1.3353;

            case "140.0":
                return 1.33514;
            case "140.1":
                return 1.33514;
            case "140.2":
                return 1.33514;
            case "140.3":
                return 1.33514;
            case "140.4":
                return 1.33514;
            case "140.5":
                return 1.33514;
            case "140.6":
                return 1.33514;
            case "140.7":
                return 1.33514;
            case "140.8":
                return 1.33514;
            case "140.9":
                return 1.33514;

            case "141.0":
                return 1.33514;
            case "141.1":
                return 1.33514;
            case "141.2":
                return 1.33514;
            case "141.3":
                return 1.33514;
            case "141.4":
                return 1.33514;
            case "141.5":
                return 1.33514;
            case "141.6":
                return 1.33514;
            case "141.7":
                return 1.33514;
            case "141.8":
                return 1.33514;
            case "141.9":
                return 1.33514;

            case "142.0":
                return 1.33514;
            case "142.1":
                return 1.33514;
            case "142.2":
                return 1.33514;
            case "142.3":
                return 1.33514;
            case "142.4":
                return 1.33514;
            case "142.5":
                return 1.33514;
            case "142.6":
                return 1.33514;
            case "142.7":
                return 1.33514;
            case "142.8":
                return 1.33514;
            case "142.9":
                return 1.33514;

            case "143.0":
                return 1.33514;
            case "143.1":
                return 1.33514;
            case "143.2":
                return 1.33514;
            case "143.3":
                return 1.33514;
            case "143.4":
                return 1.33514;
            case "143.5":
                return 1.33514;
            case "143.6":
                return 1.33514;
            case "143.7":
                return 1.33514;
            case "143.8":
                return 1.33514;
            case "143.9":
                return 1.33514;

            case "144.0":
                return 1.3354;
            case "144.1":
                return 1.3354;
            case "144.2":
                return 1.3354;
            case "144.3":
                return 1.3354;
            case "144.4":
                return 1.3354;
            case "144.5":
                return 1.3354;
            case "144.6":
                return 1.3354;
            case "144.7":
                return 1.3354;
            case "144.8":
                return 1.3354;
            case "144.9":
                return 1.3354;

            case "145.0":
                return 1.33514;
            case "145.1":
                return 1.33514;
            case "145.2":
                return 1.33514;
            case "145.3":
                return 1.33514;
            case "145.4":
                return 1.33514;
            case "145.5":
                return 1.33514;
            case "145.6":
                return 1.33514;
            case "145.7":
                return 1.33514;
            case "145.8":
                return 1.33514;
            case "145.9":
                return 1.33514;

            case "146.0":
                return 1.33514;
            case "146.1":
                return 1.33514;
            case "146.2":
                return 1.33514;
            case "146.3":
                return 1.33514;
            case "146.4":
                return 1.3354;
            case "146.5":
                return 1.33514;
            case "146.6":
                return 1.33514;
            case "146.7":
                return 1.33514;
            case "146.8":
                return 1.33514;
            case "146.9":
                return 1.33514;

            case "147.0":
                return 1.33514;
            case "147.1":
                return 1.33514;
            case "147.2":
                return 1.33514;
            case "147.3":
                return 1.33514;
            case "147.4":
                return 1.33514;
            case "147.5":
                return 1.33514;
            case "147.6":
                return 1.33514;
            case "147.7":
                return 1.33514;
            case "147.8":
                return 1.33514;
            case "147.9":
                return 1.33514;

            case "148.0":
                return 1.33514;
            case "148.1":
                return 1.33514;
            case "148.2":
                return 1.33514;
            case "148.3":
                return 1.33514;
            case "148.4":
                return 1.33514;
            case "148.5":
                return 1.33514;
            case "148.6":
                return 1.33514;
            case "148.7":
                return 1.33514;
            case "148.8":
                return 1.33514;
            case "148.9":
                return 1.33514;

            case "149.0":
                return 1.33514;
            case "149.1":
                return 1.33514;
            case "149.2":
                return 1.33514;
            case "149.3":
                return 1.33514;
            case "149.4":
                return 1.33514;
            case "149.5":
                return 1.33514;
            case "149.6":
                return 1.33514;
            case "149.7":
                return 1.33514;
            case "149.8":
                return 1.33514;
            case "149.9":
                return 1.3354;

            case "150.0":
                return 1.331515;
            case "150.1":
                return 1.331515;
            case "150.2":
                return 1.331515;
            case "150.3":
                return 1.331515;
            case "150.5":
                return 1.33515;
            case "150.4":
                return 1.331515;
            case "150.6":
                return 1.331515;
            case "150.7":
                return 1.331515;
            case "150.8":
                return 1.331515;
            case "150.9":
                return 1.331515;
            default:
                return 0d;
        }
    }

    private static Double maleWilks(String weight){

        switch (weight){
            case "40.0":    return 1.3354;
            case "40.1":    return 1.3311;
            case "40.2":    return 1.33268;
            case "40.3":    return 1.3225;
            case "40.4":    return 1.3182;
            case "40.5":    return 1.314;
            case "40.6":    return 1.3089;
            case "40.7":    return 1.3057;
            case "40.8":    return 1.3;
            case "40.9":    return 1.3354;

            case "41.0":    return 1.3354;
            case "41.1":    return 1.3354;
            case "41.2":    return 1.3354;
            case "41.3":    return 1.3354;
            case "41.4":    return 1.3354;
            case "41.5":    return 1.3354;
            case "41.6":    return 1.3354;
            case "41.7":    return 1.3354;
            case "41.8":    return 1.3354;
            case "41.9":    return 1.3354;

            case "42.0":    return 1.3354;
            case "42.1":    return 1.3354;
            case "42.2":    return 1.3354;
            case "42.3":    return 1.3354;
            case "42.4":    return 1.3354;
            case "42.5":    return 1.3354;
            case "42.6":    return 1.3354;
            case "42.7":    return 1.3354;
            case "42.8":    return 1.3354;
            case "42.9":    return 1.3354;

            case "43.0":    return 1.3354;
            case "43.1":    return 1.3354;
            case "43.2":    return 1.3354;
            case "43.3":    return 1.3354;
            case "43.4":    return 1.3354;
            case "43.5":    return 1.3354;
            case "43.6":    return 1.3354;
            case "43.7":    return 1.3354;
            case "43.8":    return 1.3354;
            case "43.9":    return 1.3354;

            case "44.0":    return 1.3354;
            case "44.1":    return 1.3354;
            case "44.2":    return 1.3354;
            case "44.3":    return 1.3354;
            case "44.4":    return 1.3354;
            case "44.5":    return 1.3354;
            case "44.6":    return 1.3354;
            case "44.7":    return 1.3354;
            case "44.8":    return 1.3354;
            case "44.9":    return 1.3354;

            case "45.0":    return 1.3354;
            case "45.1":    return 1.3354;
            case "45.2":    return 1.3354;
            case "45.3":    return 1.3354;
            case "45.4":    return 1.3354;
            case "45.5":    return 1.3354;
            case "45.6":    return 1.3354;
            case "45.7":    return 1.3354;
            case "45.8":    return 1.3354;
            case "45.9":    return 1.3354;

            case "46.0":    return 1.3354;
            case "46.1":    return 1.3354;
            case "46.2":    return 1.3354;
            case "46.3":    return 1.3354;
            case "46.4":    return 1.3354;
            case "46.5":    return 1.3354;
            case "46.6":    return 1.3354;
            case "46.7":    return 1.3354;
            case "46.8":    return 1.3354;
            case "46.9":    return 1.3354;

            case "47.0":    return 1.3354;
            case "47.1":    return 1.3354;
            case "47.2":    return 1.3354;
            case "47.3":    return 1.3354;
            case "47.4":    return 1.3354;
            case "47.5":    return 1.3354;
            case "47.6":    return 1.3354;
            case "47.7":    return 1.3354;
            case "47.8":    return 1.3354;
            case "47.9":    return 1.3354;

            case "48.0":    return 1.3354;
            case "48.1":    return 1.3354;
            case "48.2":    return 1.3354;
            case "48.3":    return 1.3354;
            case "48.4":    return 1.3354;
            case "48.5":    return 1.3354;
            case "48.6":    return 1.3354;
            case "48.7":    return 1.3354;
            case "48.8":    return 1.3354;
            case "48.9":    return 1.3354;

            case "49.0":    return 1.3354;
            case "49.1":    return 1.3354;
            case "49.2":    return 1.3354;
            case "49.3":    return 1.3354;
            case "49.4":    return 1.3354;
            case "49.5":    return 1.3354;
            case "49.6":    return 1.3354;
            case "49.7":    return 1.3354;
            case "49.8":    return 1.3354;
            case "49.9":    return 1.3354;

            case "50.0":    return 1.3355;
            case "50.1":    return 1.3355;
            case "50.2":    return 1.3355;
            case "50.3":    return 1.3355;
            case "50.5":    return 1.3355;
            case "50.4":    return 1.3355;
            case "50.6":    return 1.3355;
            case "50.7":    return 1.3355;
            case "50.8":    return 1.3355;
            case "50.9":    return 1.3355;

            case "51.0":    return 1.3355;
            case "51.1":    return 1.3355;
            case "51.2":    return 1.3355;
            case "51.3":    return 1.3355;
            case "51.4":    return 1.3355;
            case "51.5":    return 1.3355;
            case "51.6":    return 1.3355;
            case "51.7":    return 1.3355;
            case "51.8":    return 1.3355;
            case "51.9":    return 1.3355;

            case "52.0":    return 1.3355;
            case "52.1":    return 1.3355;
            case "52.2":    return 1.3355;
            case "52.3":    return 1.3355;
            case "52.5":    return 1.3355;
            case "52.4":    return 1.3355;
            case "52.6":    return 1.3355;
            case "52.7":    return 1.3355;
            case "52.8":    return 1.3355;
            case "52.9":    return 1.3355;

            case "53.0":    return 1.3355;
            case "53.1":    return 1.3355;
            case "53.2":    return 1.3355;
            case "53.3":    return 1.3355;
            case "53.4":    return 1.3355;
            case "53.5":    return 1.3355;
            case "53.6":    return 1.3355;
            case "53.7":    return 1.3355;
            case "53.8":    return 1.3355;
            case "53.9":    return 1.3355;

            case "54.0":    return 1.3355;
            case "54.1":    return 1.3355;
            case "54.2":    return 1.3355;
            case "54.3":    return 1.3355;
            case "54.4":    return 1.3355;
            case "54.5":    return 1.3355;
            case "54.6":    return 1.3355;
            case "54.7":    return 1.3355;
            case "54.8":    return 1.3355;
            case "54.9":    return 1.3355;

            case "55.0":    return 1.3355;
            case "55.1":    return 1.3355;
            case "55.2":    return 1.3355;
            case "55.3":    return 1.3355;
            case "55.4":    return 1.3355;
            case "55.5":    return 1.3355;
            case "55.6":    return 1.3355;
            case "55.7":    return 1.3355;
            case "55.8":    return 1.3355;
            case "55.9":    return 1.3355;

            case "56.0":    return 1.3355;
            case "56.1":    return 1.3355;
            case "56.2":    return 1.3355;
            case "56.3":    return 1.3355;
            case "56.4":    return 1.3355;
            case "56.5":    return 1.3355;
            case "56.6":    return 1.3355;
            case "56.7":    return 1.3355;
            case "56.8":    return 1.3355;
            case "56.9":    return 1.3355;

            case "57.0":    return 1.3355;
            case "57.1":    return 1.3355;
            case "57.2":    return 1.3355;
            case "57.3":    return 1.3355;
            case "57.4":    return 1.3355;
            case "57.5":    return 1.3355;
            case "57.6":    return 1.3355;
            case "57.7":    return 1.3355;
            case "57.8":    return 1.3355;
            case "57.9":    return 1.3355;

            case "58.0":    return 1.3355;
            case "58.1":    return 1.3355;
            case "58.2":    return 1.3355;
            case "58.3":    return 1.3355;
            case "58.5":    return 1.3355;
            case "58.4":    return 1.3355;
            case "58.6":    return 1.3355;
            case "58.7":    return 1.3355;
            case "58.8":    return 1.3355;
            case "58.9":    return 1.3355;

            case "59.0":    return 1.3355;
            case "59.1":    return 1.3355;
            case "59.2":    return 1.3355;
            case "59.3":    return 1.3355;
            case "59.4":    return 1.3355;
            case "59.5":    return 1.3355;
            case "59.6":    return 1.3355;
            case "59.7":    return 1.3355;
            case "59.8":    return 1.3355;
            case "59.9":    return 1.3355;

            case "60.0":    return 1.3356;
            case "60.1":    return 1.3356;
            case "60.2":    return 1.3356;
            case "60.3":    return 1.3356;
            case "60.4":    return 1.3356;
            case "60.5":    return 1.3356;
            case "60.6":    return 1.3356;
            case "60.7":    return 1.3356;
            case "60.8":    return 1.3356;
            case "60.9":    return 1.3356;

            case "61.0":    return 1.3356;
            case "61.1":    return 1.3356;
            case "61.2":    return 1.3356;
            case "61.3":    return 1.3356;
            case "61.4":    return 1.3356;
            case "61.5":    return 1.3356;
            case "61.6":    return 1.3356;
            case "61.7":    return 1.3356;
            case "61.8":    return 1.3356;
            case "61.9":    return 1.3356;

            case "62.0":    return 1.3356;
            case "62.1":    return 1.3356;
            case "62.2":    return 1.3356;
            case "62.3":    return 1.3356;
            case "62.4":    return 1.3356;
            case "62.5":    return 1.3356;
            case "62.6":    return 1.3356;
            case "62.7":    return 1.3356;
            case "62.8":    return 1.3356;
            case "62.9":    return 1.3356;

            case "63.0":    return 1.3356;
            case "63.1":    return 1.3356;
            case "63.2":    return 1.3356;
            case "63.3":    return 1.3356;
            case "63.4":    return 1.3356;
            case "63.5":    return 1.3356;
            case "63.6":    return 1.3356;
            case "63.7":    return 1.3356;
            case "63.8":    return 1.3356;
            case "63.9":    return 1.3356;

            case "64.0":    return 1.3354;
            case "64.1":    return 1.3356;
            case "64.2":    return 1.3356;
            case "64.3":    return 1.3356;
            case "64.4":    return 1.3354;
            case "64.5":    return 1.3354;
            case "64.6":    return 1.3354;
            case "64.7":    return 1.3354;
            case "64.8":    return 1.3354;
            case "64.9":    return 1.3354;

            case "65.0":    return 1.3356;
            case "65.1":    return 1.3356;
            case "65.2":    return 1.3356;
            case "65.3":    return 1.3356;
            case "65.4":    return 1.3356;
            case "65.5":    return 1.3356;
            case "65.6":    return 1.3356;
            case "65.7":    return 1.3356;
            case "65.8":    return 1.3356;
            case "65.9":    return 1.3356;

            case "66.0":    return 1.3356;
            case "66.1":    return 1.3356;
            case "66.2":    return 1.3356;
            case "66.3":    return 1.3356;
            case "66.4":    return 1.3356;
            case "66.5":    return 1.3356;
            case "66.6":    return 1.3356;
            case "66.7":    return 1.3356;
            case "66.8":    return 1.3356;
            case "66.9":    return 1.3356;

            case "67.0":    return 1.3356;
            case "67.1":    return 1.3356;
            case "67.2":    return 1.3356;
            case "67.3":    return 1.3356;
            case "67.4":    return 1.3356;
            case "67.5":    return 1.3356;
            case "67.6":    return 1.3356;
            case "67.7":    return 1.3356;
            case "67.8":    return 1.3356;
            case "67.9":    return 1.3356;

            case "68.0":    return 1.3356;
            case "68.1":    return 1.3356;
            case "68.2":    return 1.3356;
            case "68.3":    return 1.3356;
            case "68.4":    return 1.3356;
            case "68.5":    return 1.3356;
            case "68.6":    return 1.3356;
            case "68.7":    return 1.3356;
            case "68.8":    return 1.3356;
            case "68.9":    return 1.3356;

            case "69.0":    return 1.3356;
            case "69.1":    return 1.3356;
            case "69.2":    return 1.3356;
            case "69.3":    return 1.3356;
            case "69.4":    return 1.3356;
            case "69.5":    return 1.3356;
            case "69.6":    return 1.3356;
            case "69.7":    return 1.3356;
            case "69.8":    return 1.3356;
            case "69.9":    return 1.3356;

            case "70.0":    return 1.3356;
            case "70.1":    return 1.3356;
            case "70.2":    return 1.3356;
            case "70.3":    return 1.3356;
            case "70.4":    return 1.3356;
            case "70.5":    return 1.3356;
            case "70.6":    return 1.3356;
            case "70.7":    return 1.3356;
            case "70.8":    return 1.3356;
            case "70.9":    return 1.3356;

            case "71.0":    return 1.3357;
            case "71.1":    return 1.3357;
            case "71.2":    return 1.3357;
            case "71.3":    return 1.3357;
            case "71.4":    return 1.3357;
            case "71.5":    return 1.3357;
            case "71.6":    return 1.3357;
            case "71.7":    return 1.3357;
            case "71.8":    return 1.3357;
            case "71.9":    return 1.3357;

            case "72.0":    return 1.3357;
            case "72.1":    return 1.3357;
            case "72.2":    return 1.3357;
            case "72.3":    return 1.3357;
            case "72.4":    return 1.3357;
            case "72.5":    return 1.3357;
            case "72.6":    return 1.3357;
            case "72.7":    return 1.3357;
            case "72.8":    return 1.3357;
            case "72.9":    return 1.3354;

            case "73.0":    return 1.3357;
            case "73.1":    return 1.3357;
            case "73.2":    return 1.3357;
            case "73.3":    return 1.3357;
            case "73.4":    return 1.3357;
            case "73.5":    return 1.3357;
            case "73.6":    return 1.3357;
            case "73.7":    return 1.3357;
            case "73.8":    return 1.3357;
            case "73.9":    return 1.3357;

            case "74.0":    return 1.3357;
            case "74.1":    return 1.3357;
            case "74.2":    return 1.3357;
            case "74.3":    return 1.3357;
            case "74.4":    return 1.3357;
            case "74.5":    return 1.3354;
            case "74.6":    return 1.3354;
            case "74.7":    return 1.3354;
            case "74.8":    return 1.3354;
            case "74.9":    return 1.3354;

            case "75.0":    return 1.3354;
            case "75.1":    return 1.3354;
            case "75.2":    return 1.3354;
            case "75.3":    return 1.3354;
            case "75.4":    return 1.3357;
            case "75.5":    return 1.3357;
            case "75.6":    return 1.3357;
            case "75.7":    return 1.3357;
            case "75.8":    return 1.3357;
            case "75.9":    return 1.3357;

            case "76.0":    return 1.3357;
            case "76.1":    return 1.3357;
            case "76.2":    return 1.3357;
            case "76.3":    return 1.3357;
            case "76.4":    return 1.3357;
            case "76.5":    return 1.3357;
            case "76.6":    return 1.3357;
            case "76.7":    return 1.3357;
            case "76.8":    return 1.3357;
            case "76.9":    return 1.3357;

            case "77.0":    return 1.3357;
            case "77.1":    return 1.3357;
            case "77.2":    return 1.3357;
            case "77.3":    return 1.3357;
            case "77.4":    return 1.3357;
            case "77.5":    return 1.3357;
            case "77.6":    return 1.3357;
            case "77.7":    return 1.3357;
            case "77.8":    return 1.3357;
            case "77.9":    return 1.3357;

            case "78.0":    return 1.3357;
            case "78.1":    return 1.3357;
            case "78.2":    return 1.3357;
            case "78.3":    return 1.3357;
            case "78.4":    return 1.3357;
            case "78.5":    return 1.3357;
            case "78.6":    return 1.3357;
            case "78.7":    return 1.3357;
            case "78.8":    return 1.3357;
            case "78.9":    return 1.3357;

            case "79.0":    return 1.3357;
            case "79.1":    return 1.3357;
            case "79.2":    return 1.3357;
            case "79.3":    return 1.3357;
            case "79.4":    return 1.3357;
            case "79.5":    return 1.3357;
            case "79.6":    return 1.3357;
            case "79.7":    return 1.3357;
            case "79.8":    return 1.3357;
            case "79.9":    return 1.3357;

            case "80.0":    return 1.3358;
            case "80.1":    return 1.3358;
            case "80.2":    return 1.3358;
            case "80.3":    return 1.3358;
            case "80.4":    return 1.3358;
            case "80.5":    return 1.3358;
            case "80.6":    return 1.3358;
            case "80.7":    return 1.3358;
            case "80.8":    return 1.3358;
            case "80.9":    return 1.3358;

            case "81.0":    return 1.3358;
            case "81.1":    return 1.3358;
            case "81.2":    return 1.3358;
            case "81.3":    return 1.3358;
            case "81.4":    return 1.3358;
            case "81.5":    return 1.3358;
            case "81.6":    return 1.3358;
            case "81.7":    return 1.3358;
            case "81.8":    return 1.3358;
            case "81.9":    return 1.3358;

            case "82.0":    return 1.3358;
            case "82.1":    return 1.3358;
            case "82.2":    return 1.3358;
            case "82.3":    return 1.3358;
            case "82.4":    return 1.3358;
            case "82.5":    return 1.3358;
            case "82.6":    return 1.3358;
            case "82.7":    return 1.3358;
            case "82.8":    return 1.3358;
            case "82.9":    return 1.3358;

            case "83.0":    return 1.3358;
            case "83.1":    return 1.3358;
            case "83.2":    return 1.3358;
            case "83.3":    return 1.3358;
            case "83.4":    return 1.3358;
            case "83.5":    return 1.3358;
            case "83.6":    return 1.3358;
            case "83.7":    return 1.3358;
            case "83.8":    return 1.3358;
            case "83.9":    return 1.3358;

            case "84.0":    return 1.3358;
            case "84.1":    return 1.3358;
            case "84.2":    return 1.3358;
            case "84.3":    return 1.3358;
            case "84.4":    return 1.3358;
            case "84.5":    return 1.3354;
            case "84.6":    return 1.3358;
            case "84.7":    return 1.3358;
            case "84.8":    return 1.3354;
            case "84.9":    return 1.3358;

            case "85.0":    return 1.3358;
            case "85.1":    return 1.3358;
            case "85.2":    return 1.3358;
            case "85.3":    return 1.3358;
            case "85.4":    return 1.3358;
            case "85.5":    return 1.3358;
            case "85.6":    return 1.3358;
            case "85.7":    return 1.3358;
            case "85.8":    return 1.3358;
            case "85.9":    return 1.3358;

            case "86.0":    return 1.3358;
            case "86.1":    return 1.3358;
            case "86.2":    return 1.3358;
            case "86.3":    return 1.3358;
            case "86.4":    return 1.3358;
            case "86.5":    return 1.3358;
            case "86.6":    return 1.3358;
            case "86.7":    return 1.3358;
            case "86.8":    return 1.3358;
            case "86.9":    return 1.3358;

            case "87.0":    return 1.3358;
            case "87.1":    return 1.3358;
            case "87.2":    return 1.3358;
            case "87.3":    return 1.3358;
            case "87.4":    return 1.3358;
            case "87.5":    return 1.3358;
            case "87.6":    return 1.3358;
            case "87.7":    return 1.3358;
            case "87.8":    return 1.3358;
            case "87.9":    return 1.3358;

            case "88.0":    return 1.3358;
            case "88.1":    return 1.3358;
            case "88.2":    return 1.3358;
            case "88.3":    return 1.3358;
            case "88.4":    return 1.3358;
            case "88.5":    return 1.3358;
            case "88.6":    return 1.3358;
            case "88.7":    return 1.3358;
            case "88.8":    return 1.3358;
            case "88.9":    return 1.3358;

            case "89.0":    return 1.3358;
            case "89.1":    return 1.3358;
            case "89.2":    return 1.3358;
            case "89.3":    return 1.3358;
            case "89.4":    return 1.3358;
            case "89.5":    return 1.3358;
            case "89.6":    return 1.3358;
            case "89.7":    return 1.3358;
            case "89.8":    return 1.3358;
            case "89.9":    return 1.3358;

            case "90.0":    return 1.3359;
            case "90.1":    return 1.3359;
            case "90.2":    return 1.3359;
            case "90.3":    return 1.3359;
            case "90.4":    return 1.3359;
            case "90.5":    return 1.3359;
            case "90.6":    return 1.3359;
            case "90.7":    return 1.3359;
            case "90.8":    return 1.3359;
            case "90.9":    return 1.3359;

            case "91.0":    return 1.3359;
            case "91.1":    return 1.3359;
            case "91.2":    return 1.3359;
            case "91.3":    return 1.3359;
            case "91.4":    return 1.3359;
            case "91.5":    return 1.3359;
            case "91.6":    return 1.3359;
            case "91.7":    return 1.3359;
            case "91.8":    return 1.3359;
            case "91.9":    return 1.3359;

            case "92.0":    return 1.3359;
            case "92.1":    return 1.3359;
            case "92.2":    return 1.3359;
            case "92.3":    return 1.3359;
            case "92.4":    return 1.3359;
            case "92.5":    return 1.3359;
            case "92.6":    return 1.3359;
            case "92.7":    return 1.3359;
            case "92.8":    return 1.3359;
            case "92.9":    return 1.3359;

            case "93.0":    return 1.3359;
            case "93.1":    return 1.3359;
            case "93.2":    return 1.3359;
            case "93.3":    return 1.3359;
            case "93.4":    return 1.3359;
            case "93.5":    return 1.3359;
            case "93.6":    return 1.3359;
            case "93.7":    return 1.3359;
            case "93.8":    return 1.3359;
            case "93.9":    return 1.3359;

            case "94.0":    return 1.3359;
            case "94.1":    return 1.3359;
            case "94.2":    return 1.3359;
            case "94.3":    return 1.3359;
            case "94.4":    return 1.3359;
            case "94.5":    return 1.3359;
            case "94.6":    return 1.3359;
            case "94.7":    return 1.3359;
            case "94.8":    return 1.3359;
            case "94.9":    return 1.3359;

            case "95.0":    return 1.3359;
            case "95.1":    return 1.3359;
            case "95.2":    return 1.3359;
            case "95.3":    return 1.3359;
            case "95.4":    return 1.3359;
            case "95.5":    return 1.3359;
            case "95.6":    return 1.3359;
            case "95.7":    return 1.3359;
            case "95.8":    return 1.3359;
            case "95.9":    return 1.3359;

            case "96.0":    return 1.3354;
            case "96.1":    return 1.3354;
            case "96.2":    return 1.3354;
            case "96.3":    return 1.3354;
            case "96.4":    return 1.3359;
            case "96.5":    return 1.3359;
            case "96.6":    return 1.3359;
            case "96.7":    return 1.3354;
            case "96.8":    return 1.3354;
            case "96.9":    return 1.3354;

            case "97.0":    return 1.3354;
            case "97.1":    return 1.3354;
            case "97.2":    return 1.3359;
            case "97.3":    return 1.3359;
            case "97.4":    return 1.3359;
            case "97.5":    return 1.3359;
            case "97.6":    return 1.3359;
            case "97.7":    return 1.3359;
            case "97.8":    return 1.3359;
            case "97.9":    return 1.3359;

            case "98.0":    return 1.3359;
            case "98.1":    return 1.3359;
            case "98.2":    return 1.3359;
            case "98.3":    return 1.3359;
            case "98.4":    return 1.3359;
            case "98.5":    return 1.3359;
            case "98.6":    return 1.3359;
            case "98.7":    return 1.3359;
            case "98.8":    return 1.3359;
            case "98.9":    return 1.3354;

            case "99.0":    return 1.3359;
            case "99.1":    return 1.3359;
            case "99.2":    return 1.3359;
            case "99.3":    return 1.3359;
            case "99.4":    return 1.3359;
            case "99.5":    return 1.3359;
            case "99.6":    return 1.3359;
            case "99.7":    return 1.3359;
            case "99.8":    return 1.3359;
            case "99.9":    return 1.3354;

            case "100.0":    return 1.3350;
            case "100.1":    return 1.3350;
            case "100.2":    return 1.3350;
            case "100.3":    return 1.3350;
            case "100.4":    return 1.3350;
            case "100.5":    return 1.3350;
            case "100.6":    return 1.3350;
            case "100.7":    return 1.3350;
            case "100.8":    return 1.3350;
            case "100.9":    return 1.3350;

            case "101.0":    return 1.3350;
            case "101.1":    return 1.3350;
            case "101.2":    return 1.3350;
            case "101.3":    return 1.3350;
            case "101.4":    return 1.3350;
            case "101.5":    return 1.3350;
            case "101.6":    return 1.3350;
            case "101.7":    return 1.3350;
            case "101.8":    return 1.3350;
            case "101.9":    return 1.3354;

            case "102.0":    return 1.3350;
            case "102.1":    return 1.3350;
            case "102.2":    return 1.3350;
            case "102.3":    return 1.3350;
            case "102.4":    return 1.3350;
            case "102.5":    return 1.3350;
            case "102.6":    return 1.3350;
            case "102.7":    return 1.3350;
            case "102.8":    return 1.3350;
            case "102.9":    return 1.3350;

            case "103.0":    return 1.3350;
            case "103.1":    return 1.3350;
            case "103.2":    return 1.3350;
            case "103.3":    return 1.3350;
            case "103.4":    return 1.3350;
            case "103.5":    return 1.3350;
            case "103.6":    return 1.3350;
            case "103.7":    return 1.3350;
            case "103.8":    return 1.3350;
            case "103.9":    return 1.3350;

            case "104.0":    return 1.3354;
            case "104.1":    return 1.3354;
            case "104.2":    return 1.3354;
            case "104.3":    return 1.3354;
            case "104.4":    return 1.3350;
            case "104.5":    return 1.3350;
            case "104.6":    return 1.3350;
            case "104.7":    return 1.3350;
            case "104.8":    return 1.3350;
            case "104.9":    return 1.3350;

            case "105.0":    return 1.3350;
            case "105.1":    return 1.3350;
            case "105.2":    return 1.3350;
            case "105.3":    return 1.3350;
            case "105.4":    return 1.3350;
            case "105.5":    return 1.3350;
            case "105.6":    return 1.3350;
            case "105.7":    return 1.3350;
            case "105.8":    return 1.3350;
            case "105.9":    return 1.3350;

            case "106.0":    return 1.3350;
            case "106.1":    return 1.3350;
            case "106.2":    return 1.3350;
            case "106.3":    return 1.3350;
            case "106.4":    return 1.3350;
            case "106.5":    return 1.3350;
            case "106.6":    return 1.3350;
            case "106.7":    return 1.3350;
            case "106.8":    return 1.3350;
            case "106.9":    return 1.3350;

            case "107.0":    return 1.3350;
            case "107.1":    return 1.3350;
            case "107.2":    return 1.3350;
            case "107.3":    return 1.3350;
            case "107.4":    return 1.3350;
            case "107.5":    return 1.3350;
            case "107.6":    return 1.3350;
            case "107.7":    return 1.3350;
            case "107.8":    return 1.3350;
            case "107.9":    return 1.3350;

            case "108.0":    return 1.3350;
            case "108.1":    return 1.3350;
            case "108.2":    return 1.3350;
            case "108.3":    return 1.3350;
            case "108.4":    return 1.3350;
            case "108.5":    return 1.3350;
            case "108.6":    return 1.3350;
            case "108.7":    return 1.3350;
            case "108.8":    return 1.3350;
            case "108.9":    return 1.3350;

            case "109.0":    return 1.3350;
            case "109.1":    return 1.3350;
            case "109.2":    return 1.3350;
            case "109.3":    return 1.3350;
            case "109.4":    return 1.3350;
            case "109.5":    return 1.3350;
            case "109.6":    return 1.3350;
            case "109.7":    return 1.3350;
            case "109.8":    return 1.3350;
            case "109.9":    return 1.3350;

            case "110.0":    return 1.3351;
            case "110.1":    return 1.3351;
            case "110.2":    return 1.3351;
            case "110.3":    return 1.3351;
            case "110.4":    return 1.3351;
            case "110.5":    return 1.3351;
            case "110.6":    return 1.3351;
            case "110.7":    return 1.3351;
            case "110.8":    return 1.3351;
            case "110.9":    return 1.3351;

            case "111.0":    return 1.3351;
            case "111.1":    return 1.3351;
            case "111.2":    return 1.3351;
            case "111.3":    return 1.3351;
            case "111.4":    return 1.3351;
            case "111.5":    return 1.3351;
            case "111.6":    return 1.3351;
            case "111.7":    return 1.3351;
            case "111.8":    return 1.3351;
            case "111.9":    return 1.3351;

            case "112.0":    return 1.3351;
            case "112.1":    return 1.3351;
            case "112.2":    return 1.3351;
            case "112.3":    return 1.3351;
            case "112.4":    return 1.3351;
            case "112.5":    return 1.3351;
            case "112.6":    return 1.3351;
            case "112.7":    return 1.3351;
            case "112.8":    return 1.3351;
            case "112.9":    return 1.3351;

            case "113.0":    return 1.3351;
            case "113.1":    return 1.3351;
            case "113.2":    return 1.3351;
            case "113.3":    return 1.3351;
            case "113.4":    return 1.3351;
            case "113.5":    return 1.3351;
            case "113.6":    return 1.3351;
            case "113.7":    return 1.3351;
            case "113.8":    return 1.3351;
            case "113.9":    return 1.3351;

            case "114.0":    return 1.3354;
            case "114.1":    return 1.3354;
            case "114.2":    return 1.3354;
            case "114.3":    return 1.3354;
            case "114.4":    return 1.3354;
            case "114.5":    return 1.3354;
            case "114.6":    return 1.3354;
            case "114.7":    return 1.3354;
            case "114.8":    return 1.3354;
            case "114.9":    return 1.3354;

            case "115.0":    return 1.3351;
            case "115.1":    return 1.3351;
            case "115.2":    return 1.3351;
            case "115.3":    return 1.3351;
            case "115.4":    return 1.3351;
            case "115.5":    return 1.3351;
            case "115.6":    return 1.3351;
            case "115.7":    return 1.3351;
            case "115.8":    return 1.3351;
            case "115.9":    return 1.3351;

            case "116.0":    return 1.3351;
            case "116.1":    return 1.3351;
            case "116.2":    return 1.3351;
            case "116.3":    return 1.3351;
            case "116.4":    return 1.3351;
            case "116.5":    return 1.3351;
            case "116.6":    return 1.3351;
            case "116.7":    return 1.3351;
            case "116.8":    return 1.3351;
            case "116.9":    return 1.3351;

            case "117.0":    return 1.3351;
            case "117.1":    return 1.3351;
            case "117.2":    return 1.3351;
            case "117.3":    return 1.3351;
            case "117.4":    return 1.3351;
            case "117.5":    return 1.3351;
            case "117.6":    return 1.3351;
            case "117.7":    return 1.3351;
            case "117.8":    return 1.3351;
            case "117.9":    return 1.3351;

            case "118.0":    return 1.3351;
            case "118.1":    return 1.3351;
            case "118.2":    return 1.3351;
            case "118.3":    return 1.3351;
            case "118.4":    return 1.3354;
            case "118.5":    return 1.3351;
            case "118.6":    return 1.3351;
            case "118.7":    return 1.3351;
            case "118.8":    return 1.3351;
            case "118.9":    return 1.3351;

            case "119.0":    return 1.3351;
            case "119.1":    return 1.3351;
            case "119.2":    return 1.3351;
            case "119.3":    return 1.3351;
            case "119.4":    return 1.3351;
            case "119.5":    return 1.3351;
            case "119.6":    return 1.3351;
            case "119.7":    return 1.3351;
            case "119.8":    return 1.3351;
            case "119.9":    return 1.3351;

            case "120.0":    return 1.3352;
            case "120.1":    return 1.3352;
            case "120.2":    return 1.3352;
            case "120.3":    return 1.3352;
            case "120.4":    return 1.3352;
            case "120.5":    return 1.3352;
            case "120.6":    return 1.3352;
            case "120.7":    return 1.3352;
            case "120.8":    return 1.3352;
            case "120.9":    return 1.3352;

            case "121.0":    return 1.3352;
            case "121.1":    return 1.3352;
            case "121.2":    return 1.3352;
            case "121.3":    return 1.3352;
            case "121.4":    return 1.3352;
            case "121.5":    return 1.3352;
            case "121.6":    return 1.3352;
            case "121.7":    return 1.3352;
            case "121.8":    return 1.3352;
            case "121.9":    return 1.3352;

            case "122.0":    return 1.3352;
            case "122.1":    return 1.3352;
            case "122.2":    return 1.3352;
            case "122.3":    return 1.3352;
            case "122.4":    return 1.3352;
            case "122.5":    return 1.3352;
            case "122.6":    return 1.3352;
            case "122.7":    return 1.3352;
            case "122.8":    return 1.3352;
            case "122.9":    return 1.3352;

            case "123.0":    return 1.3352;
            case "123.1":    return 1.3352;
            case "123.2":    return 1.3352;
            case "123.3":    return 1.3352;
            case "123.4":    return 1.3352;
            case "123.5":    return 1.3352;
            case "123.6":    return 1.3352;
            case "123.7":    return 1.3352;
            case "123.8":    return 1.3352;
            case "123.9":    return 1.3352;

            case "124.0":    return 1.3354;
            case "124.1":    return 1.3354;
            case "124.2":    return 1.3352;
            case "124.3":    return 1.3354;
            case "124.4":    return 1.3352;
            case "124.5":    return 1.3354;
            case "124.6":    return 1.3354;
            case "124.7":    return 1.3354;
            case "124.8":    return 1.3354;
            case "124.9":    return 1.3354;

            case "125.0":    return 1.3352;
            case "125.1":    return 1.3352;
            case "125.2":    return 1.3352;
            case "125.3":    return 1.3352;
            case "125.4":    return 1.3354;
            case "125.5":    return 1.3352;
            case "125.6":    return 1.3352;
            case "125.7":    return 1.3352;
            case "125.8":    return 1.3352;
            case "125.9":    return 1.3352;

            case "126.0":    return 1.3352;
            case "126.1":    return 1.3352;
            case "126.2":    return 1.3352;
            case "126.3":    return 1.3352;
            case "126.4":    return 1.3352;
            case "126.5":    return 1.3352;
            case "126.6":    return 1.3352;
            case "126.7":    return 1.3352;
            case "126.8":    return 1.3352;
            case "126.9":    return 1.3352;

            case "127.0":    return 1.3352;
            case "127.1":    return 1.3352;
            case "127.2":    return 1.3352;
            case "127.3":    return 1.3352;
            case "127.4":    return 1.3352;
            case "127.5":    return 1.3352;
            case "127.6":    return 1.3352;
            case "127.7":    return 1.3352;
            case "127.8":    return 1.3352;
            case "127.9":    return 1.3352;

            case "128.0":    return 1.3352;
            case "128.1":    return 1.3352;
            case "128.2":    return 1.3352;
            case "128.3":    return 1.3354;
            case "128.4":    return 1.3352;
            case "128.5":    return 1.3352;
            case "128.6":    return 1.3352;
            case "128.7":    return 1.3352;
            case "128.8":    return 1.3352;
            case "128.9":    return 1.3352;

            case "129.0":    return 1.3352;
            case "129.1":    return 1.3352;
            case "129.2":    return 1.3352;
            case "129.3":    return 1.3352;
            case "129.4":    return 1.3352;
            case "129.5":    return 1.3352;
            case "129.6":    return 1.3352;
            case "129.7":    return 1.3352;
            case "129.8":    return 1.3352;
            case "129.9":    return 1.3352;

            case "130.0":    return 1.3353;
            case "130.1":    return 1.3353;
            case "130.2":    return 1.3353;
            case "130.3":    return 1.3353;
            case "130.4":    return 1.3353;
            case "130.5":    return 1.3353;
            case "130.6":    return 1.3353;
            case "130.7":    return 1.3353;
            case "130.8":    return 1.3353;
            case "130.9":    return 1.3353;

            case "131.0":    return 1.3353;
            case "131.1":    return 1.3353;
            case "131.2":    return 1.3353;
            case "131.3":    return 1.3353;
            case "131.4":    return 1.3353;
            case "131.5":    return 1.3353;
            case "131.6":    return 1.3353;
            case "131.7":    return 1.3353;
            case "131.8":    return 1.3353;
            case "131.9":    return 1.3353;

            case "132.0":    return 1.3352;
            case "132.1":    return 1.3353;
            case "132.2":    return 1.3352;
            case "132.3":    return 1.3352;
            case "132.4":    return 1.3352;
            case "132.5":    return 1.3352;
            case "132.6":    return 1.3352;
            case "132.7":    return 1.3352;
            case "132.8":    return 1.3352;
            case "132.9":    return 1.3352;

            case "133.0":    return 1.3353;
            case "133.1":    return 1.3353;
            case "133.2":    return 1.3352;
            case "133.3":    return 1.3353;
            case "133.4":    return 1.3353;
            case "133.5":    return 1.3353;
            case "133.6":    return 1.3353;
            case "133.7":    return 1.3353;
            case "133.8":    return 1.3353;
            case "133.9":    return 1.3353;

            case "134.0":    return 1.3354;
            case "134.1":    return 1.3354;
            case "134.2":    return 1.3352;
            case "134.3":    return 1.3354;
            case "134.4":    return 1.3353;
            case "134.5":    return 1.3354;
            case "134.6":    return 1.3354;
            case "134.7":    return 1.3354;
            case "134.8":    return 1.3354;
            case "134.9":    return 1.3354;

            case "135.0":    return 1.3353;
            case "135.1":    return 1.3353;
            case "135.2":    return 1.3352;
            case "135.3":    return 1.3353;
            case "135.4":    return 1.3354;
            case "135.5":    return 1.3353;
            case "135.6":    return 1.3353;
            case "135.7":    return 1.3353;
            case "135.8":    return 1.3353;
            case "135.9":    return 1.3353;

            case "136.0":    return 1.3353;
            case "136.1":    return 1.3353;
            case "136.2":    return 1.3352;
            case "136.3":    return 1.3353;
            case "136.4":    return 1.3353;
            case "136.5":    return 1.3353;
            case "136.6":    return 1.3353;
            case "136.7":    return 1.3353;
            case "136.8":    return 1.3353;
            case "136.9":    return 1.3352;

            case "137.0":    return 1.3353;
            case "137.1":    return 1.3353;
            case "137.2":    return 1.3352;
            case "137.3":    return 1.3353;
            case "137.4":    return 1.3353;
            case "137.5":    return 1.3353;
            case "137.6":    return 1.3353;
            case "137.7":    return 1.3353;
            case "137.8":    return 1.3353;
            case "137.9":    return 1.3353;

            case "138.0":    return 1.3353;
            case "138.1":    return 1.3353;
            case "138.2":    return 1.3352;
            case "138.3":    return 1.3354;
            case "138.4":    return 1.3353;
            case "138.5":    return 1.3353;
            case "138.6":    return 1.3353;
            case "138.7":    return 1.3353;
            case "138.8":    return 1.3353;
            case "138.9":    return 1.3353;

            case "139.0":    return 1.3353;
            case "139.1":    return 1.3353;
            case "139.2":    return 1.3353;
            case "139.3":    return 1.3353;
            case "139.4":    return 1.3353;
            case "139.5":    return 1.3353;
            case "139.6":    return 1.3353;
            case "139.7":    return 1.3353;
            case "139.8":    return 1.3353;
            case "139.9":    return 1.3353;

            case "140.0":    return 1.33514;
            case "140.1":    return 1.33514;
            case "140.2":    return 1.33514;
            case "140.3":    return 1.33514;
            case "140.4":    return 1.33514;
            case "140.5":    return 1.33514;
            case "140.6":    return 1.33514;
            case "140.7":    return 1.33514;
            case "140.8":    return 1.33514;
            case "140.9":    return 1.33514;

            case "141.0":    return 1.33514;
            case "141.1":    return 1.33514;
            case "141.2":    return 1.33514;
            case "141.3":    return 1.33514;
            case "141.4":    return 1.33514;
            case "141.5":    return 1.33514;
            case "141.6":    return 1.33514;
            case "141.7":    return 1.33514;
            case "141.8":    return 1.33514;
            case "141.9":    return 1.33514;

            case "142.0":    return 1.33514;
            case "142.1":    return 1.33514;
            case "142.2":    return 1.33514;
            case "142.3":    return 1.33514;
            case "142.4":    return 1.33514;
            case "142.5":    return 1.33514;
            case "142.6":    return 1.33514;
            case "142.7":    return 1.33514;
            case "142.8":    return 1.33514;
            case "142.9":    return 1.33514;

            case "143.0":    return 1.33514;
            case "143.1":    return 1.33514;
            case "143.2":    return 1.33514;
            case "143.3":    return 1.33514;
            case "143.4":    return 1.33514;
            case "143.5":    return 1.33514;
            case "143.6":    return 1.33514;
            case "143.7":    return 1.33514;
            case "143.8":    return 1.33514;
            case "143.9":    return 1.33514;

            case "144.0":    return 1.3354;
            case "144.1":    return 1.3354;
            case "144.2":    return 1.3354;
            case "144.3":    return 1.3354;
            case "144.4":    return 1.3354;
            case "144.5":    return 1.3354;
            case "144.6":    return 1.3354;
            case "144.7":    return 1.3354;
            case "144.8":    return 1.3354;
            case "144.9":    return 1.3354;

            case "145.0":    return 1.33514;
            case "145.1":    return 1.33514;
            case "145.2":    return 1.33514;
            case "145.3":    return 1.33514;
            case "145.4":    return 1.33514;
            case "145.5":    return 1.33514;
            case "145.6":    return 1.33514;
            case "145.7":    return 1.33514;
            case "145.8":    return 1.33514;
            case "145.9":    return 1.33514;

            case "146.0":    return 1.33514;
            case "146.1":    return 1.33514;
            case "146.2":    return 1.33514;
            case "146.3":    return 1.33514;
            case "146.4":    return 1.3354;
            case "146.5":    return 1.33514;
            case "146.6":    return 1.33514;
            case "146.7":    return 1.33514;
            case "146.8":    return 1.33514;
            case "146.9":    return 1.33514;

            case "147.0":    return 1.33514;
            case "147.1":    return 1.33514;
            case "147.2":    return 1.33514;
            case "147.3":    return 1.33514;
            case "147.4":    return 1.33514;
            case "147.5":    return 1.33514;
            case "147.6":    return 1.33514;
            case "147.7":    return 1.33514;
            case "147.8":    return 1.33514;
            case "147.9":    return 1.33514;

            case "148.0":    return 1.33514;
            case "148.1":    return 1.33514;
            case "148.2":    return 1.33514;
            case "148.3":    return 1.33514;
            case "148.4":    return 1.33514;
            case "148.5":    return 1.33514;
            case "148.6":    return 1.33514;
            case "148.7":    return 1.33514;
            case "148.8":    return 1.33514;
            case "148.9":    return 1.33514;

            case "149.0":    return 1.33514;
            case "149.1":    return 1.33514;
            case "149.2":    return 1.33514;
            case "149.3":    return 1.33514;
            case "149.4":    return 1.33514;
            case "149.5":    return 1.33514;
            case "149.6":    return 1.33514;
            case "149.7":    return 1.33514;
            case "149.8":    return 1.33514;
            case "149.9":    return 1.3354;

            case "150.0":    return 1.331515;
            case "150.1":    return 1.331515;
            case "150.2":    return 1.331515;
            case "150.3":    return 1.331515;
            case "150.5":    return 1.33515;
            case "150.4":    return 1.331515;
            case "150.6":    return 1.331515;
            case "150.7":    return 1.331515;
            case "150.8":    return 1.331515;
            case "150.9":    return 1.331515;

            case "151.0":    return 1.331515;
            case "151.1":    return 1.331515;
            case "151.2":    return 1.331515;
            case "151.3":    return 1.331515;
            case "151.4":    return 1.331515;
            case "151.5":    return 1.331515;
            case "151.6":    return 1.331515;
            case "151.7":    return 1.331515;
            case "151.8":    return 1.331515;
            case "151.9":    return 1.331515;

            case "152.0":    return 1.331515;
            case "152.1":    return 1.3355;
            case "152.2":    return 1.3355;
            case "152.3":    return 1.3355;
            case "152.5":    return 1.3355;
            case "152.4":    return 1.3355;
            case "152.6":    return 1.3355;
            case "152.7":    return 1.33515;
            case "152.8":    return 1.3355;
            case "152.9":    return 1.3355;

            case "153.0":    return 1.3355;
            case "153.1":    return 1.3355;
            case "153.2":    return 1.3355;
            case "153.3":    return 1.3355;
            case "153.4":    return 1.3355;
            case "153.5":    return 1.3355;
            case "153.6":    return 1.3355;
            case "153.7":    return 1.3355;
            case "153.8":    return 1.3355;
            case "153.9":    return 1.3355;

            case "154.0":    return 1.3355;
            case "154.1":    return 1.3355;
            case "154.2":    return 1.3355;
            case "154.3":    return 1.3355;
            case "154.4":    return 1.3355;
            case "154.5":    return 1.3355;
            case "154.6":    return 1.3355;
            case "154.7":    return 1.3355;
            case "154.8":    return 1.3355;
            case "154.9":    return 1.3355;

            case "155.0":    return 1.3355;
            case "155.1":    return 1.3355;
            case "155.2":    return 1.3355;
            case "155.3":    return 1.3355;
            case "155.4":    return 1.3355;
            case "155.5":    return 1.3355;
            case "155.6":    return 1.3355;
            case "155.7":    return 1.3355;
            case "155.8":    return 1.3355;
            case "155.9":    return 1.3355;

            case "156.0":    return 1.3355;
            case "156.1":    return 1.3355;
            case "156.2":    return 1.3355;
            case "156.3":    return 1.3355;
            case "156.4":    return 1.3355;
            case "156.5":    return 1.3355;
            case "156.6":    return 1.3355;
            case "156.7":    return 1.3355;
            case "156.8":    return 1.3355;
            case "156.9":    return 1.3355;

            case "157.0":    return 1.3355;
            case "157.1":    return 1.3355;
            case "157.2":    return 1.3355;
            case "157.3":    return 1.3355;
            case "157.4":    return 1.3355;
            case "157.5":    return 1.3355;
            case "157.6":    return 1.3355;
            case "157.7":    return 1.3355;
            case "157.8":    return 1.3355;
            case "157.9":    return 1.3355;

            case "158.0":    return 1.3355;
            case "158.1":    return 1.3355;
            case "158.2":    return 1.3355;
            case "158.3":    return 1.3355;
            case "158.5":    return 1.3355;
            case "158.4":    return 1.3355;
            case "158.6":    return 1.3355;
            case "158.7":    return 1.3355;
            case "158.8":    return 1.3355;
            case "158.9":    return 1.3355;

            case "159.0":    return 1.3355;
            case "159.1":    return 1.3355;
            case "159.2":    return 1.3355;
            case "159.3":    return 1.3355;
            case "159.4":    return 1.3355;
            case "159.5":    return 1.3355;
            case "159.6":    return 1.3355;
            case "159.7":    return 1.3355;
            case "159.8":    return 1.3355;
            case "159.9":    return 1.3355;

            case "160.0":    return 1.3356;
            case "160.1":    return 1.3356;
            case "160.2":    return 1.3356;
            case "160.3":    return 1.3356;
            case "160.4":    return 1.3356;
            case "160.5":    return 1.3356;
            case "160.6":    return 1.3356;
            case "160.7":    return 1.3356;
            case "160.8":    return 1.3356;
            case "160.9":    return 1.3356;

            case "161.0":    return 1.3356;
            case "161.1":    return 1.3356;
            case "161.2":    return 1.3356;
            case "161.3":    return 1.3356;
            case "161.4":    return 1.3356;
            case "161.5":    return 1.3356;
            case "161.6":    return 1.3356;
            case "161.7":    return 1.3356;
            case "161.8":    return 1.3356;
            case "161.9":    return 1.3356;

            case "162.0":    return 1.3356;
            case "162.1":    return 1.3356;
            case "162.2":    return 1.3356;
            case "162.3":    return 1.3356;
            case "162.4":    return 1.3356;
            case "162.5":    return 1.3356;
            case "162.6":    return 1.3356;
            case "162.7":    return 1.3356;
            case "162.8":    return 1.3356;
            case "162.9":    return 1.3356;

            case "163.0":    return 1.3356;
            case "163.1":    return 1.3356;
            case "163.2":    return 1.3356;
            case "163.3":    return 1.3356;
            case "163.4":    return 1.3356;
            case "163.5":    return 1.3356;
            case "163.6":    return 1.3356;
            case "163.7":    return 1.3356;
            case "163.8":    return 1.3356;
            case "163.9":    return 1.3356;

            case "164.0":    return 1.3354;
            case "164.1":    return 1.3356;
            case "164.2":    return 1.3356;
            case "164.3":    return 1.3356;
            case "164.4":    return 1.3354;
            case "164.5":    return 1.3354;
            case "164.6":    return 1.3354;
            case "164.7":    return 1.3354;
            case "164.8":    return 1.3354;
            case "164.9":    return 1.3354;

            case "165.0":    return 1.3356;
            case "165.1":    return 1.3356;
            case "165.2":    return 1.3356;
            case "165.3":    return 1.3356;
            case "165.4":    return 1.3356;
            case "165.5":    return 1.3356;
            case "165.6":    return 1.3356;
            case "165.7":    return 1.3356;
            case "165.8":    return 1.3356;
            case "165.9":    return 1.3356;

            case "166.0":    return 1.3356;
            case "166.1":    return 1.3356;
            case "166.2":    return 1.3356;
            case "166.3":    return 1.3356;
            case "166.4":    return 1.3356;
            case "166.5":    return 1.3356;
            case "166.6":    return 1.3356;
            case "166.7":    return 1.3356;
            case "166.8":    return 1.3356;
            case "166.9":    return 1.3356;

            case "167.0":    return 1.3356;
            case "167.1":    return 1.3356;
            case "167.2":    return 1.3356;
            case "167.3":    return 1.3356;
            case "167.4":    return 1.3356;
            case "167.5":    return 1.3356;
            case "167.6":    return 1.3356;
            case "167.7":    return 1.3356;
            case "167.8":    return 1.3356;
            case "167.9":    return 1.3356;

            case "168.0":    return 1.3356;
            case "168.1":    return 1.3356;
            case "168.2":    return 1.3356;
            case "168.3":    return 1.3356;
            case "168.4":    return 1.3356;
            case "168.5":    return 1.3356;
            case "168.6":    return 1.3356;
            case "168.7":    return 1.3356;
            case "168.8":    return 1.3356;
            case "168.9":    return 1.3356;

            case "169.0":    return 1.3356;
            case "169.1":    return 1.3356;
            case "169.2":    return 1.3356;
            case "169.3":    return 1.3356;
            case "169.4":    return 1.3356;
            case "169.5":    return 1.3356;
            case "169.6":    return 1.3356;
            case "169.7":    return 1.3356;
            case "169.8":    return 1.3356;
            case "169.9":    return 1.3356;

            case "170.0":    return 1.3356;
            case "170.1":    return 1.3356;
            case "170.2":    return 1.3356;
            case "170.3":    return 1.3356;
            case "170.4":    return 1.3356;
            case "170.5":    return 1.3356;
            case "170.6":    return 1.3356;
            case "170.7":    return 1.3356;
            case "170.8":    return 1.3356;
            case "170.9":    return 1.3356;

            case "171.0":    return 1.3357;
            case "171.1":    return 1.3357;
            case "171.2":    return 1.3357;
            case "171.3":    return 1.3357;
            case "171.4":    return 1.3357;
            case "171.5":    return 1.3357;
            case "171.6":    return 1.3357;
            case "171.7":    return 1.3357;
            case "171.8":    return 1.3357;
            case "171.9":    return 1.3357;

            case "172.0":    return 1.3357;
            case "172.1":    return 1.3357;
            case "172.2":    return 1.3357;
            case "172.3":    return 1.3357;
            case "172.4":    return 1.3357;
            case "172.5":    return 1.3357;
            case "172.6":    return 1.3357;
            case "172.7":    return 1.3357;
            case "172.8":    return 1.3357;
            case "172.9":    return 1.3354;

            case "173.0":    return 1.3357;
            case "173.1":    return 1.3357;
            case "173.2":    return 1.3357;
            case "173.3":    return 1.3357;
            case "173.4":    return 1.3357;
            case "173.5":    return 1.3357;
            case "173.6":    return 1.3357;
            case "173.7":    return 1.3357;
            case "173.8":    return 1.3357;
            case "173.9":    return 1.3357;

            case "174.0":    return 1.3357;
            case "174.1":    return 1.3357;
            case "174.2":    return 1.3357;
            case "174.3":    return 1.3357;
            case "174.4":    return 1.3357;
            case "174.5":    return 1.3354;
            case "174.6":    return 1.3354;
            case "174.7":    return 1.3354;
            case "174.8":    return 1.3354;
            case "174.9":    return 1.3354;

            case "175.0":    return 1.3354;
            case "175.1":    return 1.3354;
            case "175.2":    return 1.3354;
            case "175.3":    return 1.3354;
            case "175.4":    return 1.3357;
            case "175.5":    return 1.3357;
            case "175.6":    return 1.3357;
            case "175.7":    return 1.3357;
            case "175.8":    return 1.3357;
            case "175.9":    return 1.3357;

            case "176.0":    return 1.3357;
            case "176.1":    return 1.3357;
            case "176.2":    return 1.3357;
            case "176.3":    return 1.3357;
            case "176.4":    return 1.3357;
            case "176.5":    return 1.3357;
            case "176.6":    return 1.3357;
            case "176.7":    return 1.3357;
            case "176.8":    return 1.3357;
            case "176.9":    return 1.3357;

            case "177.0":    return 1.3357;
            case "177.1":    return 1.3357;
            case "177.2":    return 1.3357;
            case "177.3":    return 1.3357;
            case "177.4":    return 1.3357;
            case "177.5":    return 1.3357;
            case "177.6":    return 1.3357;
            case "177.7":    return 1.3357;
            case "177.8":    return 1.3357;
            case "177.9":    return 1.3357;

            case "178.0":    return 1.3357;
            case "178.1":    return 1.3357;
            case "178.2":    return 1.3357;
            case "178.3":    return 1.3357;
            case "178.4":    return 1.3357;
            case "178.5":    return 1.3357;
            case "178.6":    return 1.3357;
            case "178.7":    return 1.3357;
            case "178.8":    return 1.3357;
            case "178.9":    return 1.3357;

            case "179.0":    return 1.3357;
            case "179.1":    return 1.3357;
            case "179.2":    return 1.3357;
            case "179.3":    return 1.3357;
            case "179.4":    return 1.3357;
            case "179.5":    return 1.3357;
            case "179.6":    return 1.3357;
            case "179.7":    return 1.3357;
            case "179.8":    return 1.3357;
            case "179.9":    return 1.3357;

            case "180.0":    return 1.3358;
            case "180.1":    return 1.3358;
            case "180.2":    return 1.3358;
            case "180.3":    return 1.3358;
            case "180.4":    return 1.3358;
            case "180.5":    return 1.3358;
            case "180.6":    return 1.3358;
            case "180.7":    return 1.3358;
            case "180.8":    return 1.3358;
            case "180.9":    return 1.3358;

            case "181.0":    return 1.3358;
            case "181.1":    return 1.3358;
            case "181.2":    return 1.3358;
            case "181.3":    return 1.33518;
            case "181.4":    return 1.33518;
            case "181.5":    return 1.33518;
            case "181.6":    return 1.33518;
            case "181.7":    return 1.33518;
            case "181.8":    return 1.33518;
            case "181.9":    return 1.33518;

            case "182.0":    return 1.33518;
            case "182.1":    return 1.33518;
            case "182.2":    return 1.33518;
            case "182.3":    return 1.33518;
            case "182.4":    return 1.33518;
            case "182.5":    return 1.33518;
            case "182.6":    return 1.33518;
            case "182.7":    return 1.33518;
            case "182.8":    return 1.33518;
            case "182.9":    return 1.33518;

            case "183.0":    return 1.33518;
            case "183.1":    return 1.33518;
            case "183.2":    return 1.33518;
            case "183.3":    return 1.33518;
            case "183.4":    return 1.33518;
            case "183.5":    return 1.33518;
            case "183.6":    return 1.33518;
            case "183.7":    return 1.33518;
            case "183.8":    return 1.33518;
            case "183.9":    return 1.33518;

            case "184.0":    return 1.33518;
            case "184.1":    return 1.33518;
            case "184.2":    return 1.33518;
            case "184.3":    return 1.33518;
            case "184.4":    return 1.33518;
            case "184.5":    return 1.3354;
            case "184.6":    return 1.33518;
            case "184.7":    return 1.33518;
            case "184.8":    return 1.3354;
            case "184.9":    return 1.33518;

            case "185.0":    return 1.33518;
            case "185.1":    return 1.33518;
            case "185.2":    return 1.33518;
            case "185.3":    return 1.33518;
            case "185.4":    return 1.33518;
            case "185.5":    return 1.33518;
            case "185.6":    return 1.33518;
            case "185.7":    return 1.33518;
            case "185.8":    return 1.33518;
            case "185.9":    return 1.33518;

            case "186.0":    return 1.33518;
            case "186.1":    return 1.33518;
            case "186.2":    return 1.33518;
            case "186.3":    return 1.33518;
            case "186.4":    return 1.33518;
            case "186.5":    return 1.33518;
            case "186.6":    return 1.33518;
            case "186.7":    return 1.33518;
            case "186.8":    return 1.33518;
            case "186.9":    return 1.33518;

            case "187.0":    return 1.33518;
            case "187.1":    return 1.33518;
            case "187.2":    return 1.33518;
            case "187.3":    return 1.33518;
            case "187.4":    return 1.33518;
            case "187.5":    return 1.33518;
            case "187.6":    return 1.33518;
            case "187.7":    return 1.33518;
            case "187.8":    return 1.33518;
            case "187.9":    return 1.33518;

            case "188.0":    return 1.3358;
            case "188.1":    return 1.3358;
            case "188.2":    return 1.3358;
            case "188.3":    return 1.3358;
            case "188.4":    return 1.3358;
            case "188.5":    return 1.3358;
            case "188.6":    return 1.3358;
            case "188.7":    return 1.3358;
            case "188.8":    return 1.33518;
            case "188.9":    return 1.3358;

            case "189.0":    return 1.33518;
            case "189.1":    return 1.33518;
            case "189.2":    return 1.33518;
            case "189.3":    return 1.33518;
            case "189.4":    return 1.33518;
            case "189.5":    return 1.33518;
            case "189.6":    return 1.33518;
            case "189.7":    return 1.33518;
            case "189.8":    return 1.33518;
            case "189.9":    return 1.3358;

            case "190.0":    return 1.33519;
            case "190.1":    return 1.33519;
            case "190.2":    return 1.33519;
            case "190.3":    return 1.33519;
            case "190.4":    return 1.33519;
            case "190.5":    return 1.33519;
            case "190.6":    return 1.33519;
            case "190.7":    return 1.33519;
            case "190.8":    return 1.33519;
            case "190.9":    return 1.33519;

            case "191.0":    return 1.33519;
            case "191.1":    return 1.33519;
            case "191.2":    return 1.33519;
            case "191.3":    return 1.33519;
            case "191.4":    return 1.33519;
            case "191.5":    return 1.33519;
            case "191.6":    return 1.33519;
            case "191.7":    return 1.33519;
            case "191.8":    return 1.33519;
            case "191.9":    return 1.33519;

            case "192.0":    return 1.33519;
            case "192.1":    return 1.33519;
            case "192.2":    return 1.33519;
            case "192.3":    return 1.33519;
            case "192.4":    return 1.33519;
            case "192.5":    return 1.33519;
            case "192.6":    return 1.33519;
            case "192.7":    return 1.33519;
            case "192.8":    return 1.33519;
            case "192.9":    return 1.33519;

            case "193.0":    return 1.33519;
            case "193.1":    return 1.33519;
            case "193.2":    return 1.33519;
            case "193.3":    return 1.33519;
            case "193.4":    return 1.33519;
            case "193.5":    return 1.33519;
            case "193.6":    return 1.33519;
            case "193.7":    return 1.33519;
            case "193.8":    return 1.33519;
            case "193.9":    return 1.33519;

            case "194.0":    return 1.33519;
            case "194.1":    return 1.33519;
            case "194.2":    return 1.33519;
            case "194.3":    return 1.33519;
            case "194.4":    return 1.33519;
            case "194.5":    return 1.33519;
            case "194.6":    return 1.33519;
            case "194.7":    return 1.33519;
            case "194.8":    return 1.33519;
            case "194.9":    return 1.33519;

            case "195.0":    return 1.33519;
            case "195.1":    return 1.33519;
            case "195.2":    return 1.33519;
            case "195.3":    return 1.33519;
            case "195.4":    return 1.33519;
            case "195.5":    return 1.33519;
            case "195.6":    return 1.33519;
            case "195.7":    return 1.33519;
            case "195.8":    return 1.33519;
            case "195.9":    return 1.33519;

            case "196.0":    return 1.3354;
            case "196.1":    return 1.3354;
            case "196.2":    return 1.3354;
            case "196.3":    return 1.3354;
            case "196.4":    return 1.33519;
            case "196.5":    return 1.33519;
            case "196.6":    return 1.33519;
            case "196.7":    return 1.3354;
            case "196.8":    return 1.3354;
            case "196.9":    return 1.3354;

            case "197.0":    return 1.3354;
            case "197.1":    return 1.3354;
            case "197.2":    return 1.33519;
            case "197.3":    return 1.33519;
            case "197.4":    return 1.33519;
            case "197.5":    return 1.33519;
            case "197.6":    return 1.33519;
            case "197.7":    return 1.33519;
            case "197.8":    return 1.33519;
            case "197.9":    return 1.33519;

            case "198.0":    return 1.33519;
            case "198.1":    return 1.33519;
            case "198.2":    return 1.33519;
            case "198.3":    return 1.33519;
            case "198.4":    return 1.33519;
            case "198.5":    return 1.33519;
            case "198.6":    return 1.33519;
            case "198.7":    return 1.33519;
            case "198.8":    return 1.33519;
            case "198.9":    return 1.3354;

            case "199.0":    return 1.3359;
            case "199.1":    return 1.3359;
            case "199.2":    return 1.3359;
            case "199.3":    return 1.3359;
            case "199.4":    return 1.3359;
            case "199.5":    return 1.3359;
            case "199.6":    return 1.3359;
            case "199.7":    return 1.3359;
            case "199.8":    return 1.3359;
            case "199.9":    return 1.3354;

            case "200.0":    return 1.3350;
            case "200.1":    return 1.3350;
            case "200.2":    return 1.3350;
            case "200.3":    return 1.3350;
            case "200.4":    return 1.3350;
            case "200.5":    return 1.3350;
            case "200.6":    return 1.3350;
            case "200.7":    return 1.3350;
            case "200.8":    return 1.3350;
            case "200.9":    return 1.3350;

            case "201.0":    return 1.3350;
            case "201.1":    return 1.3350;
            case "201.2":    return 1.3350;
            case "201.3":    return 1.3350;
            case "201.4":    return 1.3350;
            case "201.5":    return 1.3350;
            case "201.6":    return 1.3350;
            case "201.7":    return 1.3350;
            case "201.8":    return 1.3350;
            case "201.9":    return 1.3354;

            case "202.0":    return 1.3350;
            case "202.1":    return 1.3350;
            case "202.2":    return 1.3350;
            case "202.3":    return 1.3350;
            case "202.4":    return 1.3350;
            case "202.5":    return 1.3350;
            case "202.6":    return 1.3350;
            case "202.7":    return 1.3350;
            case "202.8":    return 1.3350;
            case "202.9":    return 1.3350;

            case "203.0":    return 1.3350;
            case "203.1":    return 1.3350;
            case "203.2":    return 1.3350;
            case "203.3":    return 1.3350;
            case "203.4":    return 1.3350;
            case "203.5":    return 1.3350;
            case "203.6":    return 1.3350;
            case "203.7":    return 1.3350;
            case "203.8":    return 1.3350;
            case "203.9":    return 1.3350;

            case "204.0":    return 1.3354;
            case "204.1":    return 1.3354;
            case "204.2":    return 1.3354;
            case "204.3":    return 1.3354;
            case "204.4":    return 1.3350;
            case "204.5":    return 1.3350;
            case "204.6":    return 1.3350;
            case "204.7":    return 1.3350;
            case "204.8":    return 1.3350;
            case "204.9":    return 1.3350;

            case "205.0":    return 1.3350;
            case "205.1":    return 1.3350;
            case "205.2":    return 1.3350;
            case "205.3":    return 1.3350;
            case "205.4":    return 1.3350;
            case "205.5":    return 1.3350;
            case "205.6":    return 1.3350;
            case "205.7":    return 1.3350;
            case "205.8":    return 1.3350;
            case "205.9":    return 1.3350;

            default:    return 0d;
        }
    }
}
