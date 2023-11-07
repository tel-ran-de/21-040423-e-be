package de.telran;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class AtmTest {

    @Test
    public void checkTransactionFromCorrectCardToCorrectCardIsSuccess() {
        int amountToTranfer = 10;
        Card card = Mockito.mock(Card.class);// пустышка
        Mockito.when(card.makeTransaction(Mockito.eq("pin"), Mockito.anyInt())).thenReturn(amountToTranfer);
        Mockito.when(card.makeTransaction(Mockito.eq("pin2"), Mockito.anyInt())).thenReturn(amountToTranfer);

        Card cardTo = new Card("pin2");
        Atm atm = new Atm();
        atm.translateFromTo(card,"pin", cardTo, amountToTranfer);
        Assertions.assertEquals(amountToTranfer, cardTo.getSum("pin2"));
        Mockito.verify(card.makeTransaction(Mockito.anyString(), Mockito.anyInt()), Mockito.times(1));
    }

}