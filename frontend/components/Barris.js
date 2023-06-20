import React from 'react'

export const Barris = () => {
  return (
    <div className='border-2 border-secondary'>
        <div>Districtes:</div>
        <ul className='grid p-2 gap-y-3'> 
        <div className='flex justify-between'>
                <li className='px-2'>Les Corts</li>
                <input type='checkbox'/>
            </div>              
            <div className='flex justify-between'>
                <li className='px-2'>Gracia</li>
                <input type='checkbox'/>
            </div>
            <div className='flex justify-between'>
                <li className='px-2'>Sants</li>
                <input type='checkbox'/>
            </div>          
            <div className='flex justify-between'>
                <li className='px-2'>Nou Barris</li>
                <input type='checkbox'/>
            </div>              
            <div className='flex justify-between'>
                <li className='px-2'>Sant Andreu</li>
                <input type='checkbox'/>
            </div>
            <div className='flex justify-between'>
                <li className='px-2'>Ciutat Vella</li>
                <input type='checkbox'/>
            </div>             
             <div className='flex justify-between'>
                <li className='px-2'>Horta- Guinardo</li>
                <input type='checkbox'/>
            </div>  
            <div className='flex justify-between'>
                <li className='px-2'>Sarria-Sant Gervasi</li>
                <input type='checkbox'/>
            </div>  
            <div className='flex justify-between'>
                <li className='px-2'>Sant Martí</li>
                <input type='checkbox'/>
            </div>  
            <div className='flex justify-between'>
                <li className='px-2'>Eixample</li>
                <input type='checkbox'/>
            </div>  

        </ul>
    </div>
  )
}
