'use strict'
// 1
console.log('前村涼');
// 2
$(function(){
    $('#button1').on('click',function(){
        $('#name').css('color', 'red');
    });
});
// 3
$(function(){
    $('#button2').on('click',function(){
        alert($('#age').val());
    });
});
// 4
$(function(){
    $('#button3').on('click',function(){
        $('#button3').prop('disabled', true);
    });
});
// 5
$(function(){

    $('#println').hide();
    $('#console').hide();

    $('#select').on('change', function(){
        const value = $(this).val();

        if(value === 'Java'){
            $('#println').show();
            $('#console').hide();
        }
        else if(value === 'JavaScript'){
            $('#println').hide();
            $('#console').show();
        }
        else{
            $('#println').hide();
            $('#console').hide();
        }
    });

});
